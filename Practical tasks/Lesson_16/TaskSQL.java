
import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskSQL {

    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) {


        try {
            connection = ConnectToDb.start();
            if(!connection.isClosed()){
                System.out.println("Connection is active");
            }

            statement = connection.createStatement();

            deleteTable();
            createTable();

            addCar("Toyota","Prius",2017);
            addCar("Citroen","C8",2007);
            addCar("Volkswagen","Jetta",2008);
            addCar("Volkswagen","Passat",2004);
            addCar("SEAT","Ibiza",1994);
            addCar("Renault","Espace",2006);
            addCar("KIA","Carnival",2021);

            statement.execute("DELETE FROM cars ORDER BY year LIMIT 1");      //Delete oldest car - First method

            List<Car> carList = getListOfCars();                                     //Delete oldest car - Second method
            String sqlDeleteOldest = "DELETE FROM cars WHERE id="+getIdOldestCar(carList);
            statement.execute(sqlDeleteOldest);

            connection.close();
            if(connection.isClosed()){
                System.out.println("Connection is closed");
            }
        } catch (Exception e) {
            System.out.println("Connection to database failed");
        }
    }


    private static void createTable() throws SQLException {
        System.out.print("Creating table... ");
        String createTableCommand = "CREATE TABLE cars (id INTEGER NOT NULL AUTO_INCREMENT, brand VARCHAR(255), model VARCHAR(255), year INTEGER, PRIMARY KEY (id))";

        try {
            statement.execute("SELECT * FROM cars");
            System.out.println("table \"cars\" already created");
        } catch (SQLException e){
            statement.executeUpdate(createTableCommand);
            System.out.println("New table \"cars\" created");
        }
    }

    private static void deleteTable() {
        System.out.print("Deleting table... ");

        try{
            statement.execute("DROP TABLE cars");
            System.out.println("table deleted");
        } catch (SQLException e){
            System.out.println("can't find table \"cars\"");
        }
    }

    private static void addCar(String brand, String model, int year) throws SQLException {
        String command = "INSERT INTO cars (brand, model, year) VALUES (?,?,?)";
        PreparedStatement prepareStatement = connection.prepareStatement(command);
        prepareStatement.setString(1, brand);
        prepareStatement.setString(2, model);
        prepareStatement.setInt(3, year);
        prepareStatement.executeUpdate();
        System.out.printf("new car %s %s added successful\n", brand, model);
    }

    private static List<Car> getListOfCars () throws SQLException {
        List<Car> carList = new ArrayList<>();
        ResultSet allCars = statement.executeQuery("SELECT * FROM cars");
        while (allCars.next()){
            carList.add(new Car(
                    allCars.getInt("id"),
                    allCars.getString("brand"),
                    allCars.getString("model"),
                    allCars.getInt("year")
            ));
        }
        return carList;
    }

    private static int getIdOldestCar (List<Car> carList){
        carList.sort(Comparator.comparing(Car::getYear));
        return carList.get(0).getId();
    }
}
