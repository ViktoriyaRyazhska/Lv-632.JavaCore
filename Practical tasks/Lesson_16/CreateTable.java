

import com.mysql.jdbc.Driver;

import java.sql.*;

public class CreateTable {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/cars";

    static final String USER = "root";
    static final String PASS = "#Peniskop911911";

    public static Connection conn = null;
    public static Statement stmt = null;
    public static PreparedStatement pstmt = null;

    public static void main(String[] args) {
        try {

            connectToDB();

            String sql;
            stmt = conn.createStatement();

            createTable();

            addCar("Citoren", "CX", 1974);
            addCar("Citoren", "XM", 1989);
            addCar("Citoren", "C8", 2002);
            addCar("Citoren", "C6", 2005);

            addCar("Volkswagen", "Sharan", 1995);
            addCar("Volkswagen", "Phaeton", 2002);
            addCar("Volkswagen", "Scirocco III", 2008);


            getAllCars();
            System.out.println();
            findByBrand("Citroen");
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) { }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("The End");
    }

    public static void connectToDB() throws ClassNotFoundException, SQLException {
// Register JDBC driver
        Class.forName(JDBC_DRIVER);

// Open a connection
        System.out.println("Connecting to database...");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public static void createTable() throws SQLException {
        System.out.println("Creating table Cars...");
        String sql = "CREATE TABLE IF NOT EXISTS Cars " + "(id INTEGER NOT NULL AUTO_INCREMENT, "
                + " brand VARCHAR(255), " + "model VARCHAR(255)" + " year_of_production INTEGER, " + " PRIMARY KEY (brand))";
        stmt.executeUpdate(sql);
        System.out.println("Table Cars was be created");
    }

    public static void addCar(String brand, String model, int  year_of_production) throws SQLException {
        System.out.println("Adding car to the table...");
        String sql = "INSERT INTO Cars(brand, model, year_of_production) VALUES(?, ?, ?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, brand);
        pstmt.setString(2, model);
        pstmt.setInt(3, year_of_production);
        pstmt.executeUpdate();
        System.out.println("Car " + brand + " "+ model + " " + year_of_production + " was be added" );
    }

    public static void getAllCars() throws SQLException {
        stmt = conn.createStatement();
        String sql = "SELECT id, brand, model, year_of_production, FROM Cars";
        ResultSet rs = stmt.executeQuery(sql);
        printResultSet(rs);
    }

    public static void findByBrand(String brand) throws SQLException {
        String sql = "SELECT brand, model, year_of_production, FROM Cars where model == ?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, brand);
        ResultSet rs = pstmt.executeQuery();
        printResultSet(rs);
    }

    private static void printResultSet(ResultSet rs) throws SQLException {
        while (rs.next()) {
            int id = rs.getInt("id");
            String brand = rs.getString("brand");
            String model = rs.getString("model");
            int year = rs.getInt("year");

            System.out.print("ID: " + id);
            System.out.print(", brand: " + brand);
            System.out.println(", model: " + model);
            System.out.println(", year: " + year);
        }
    }
}

