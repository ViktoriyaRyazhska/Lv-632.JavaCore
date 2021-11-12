import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDb {
    public final static String URL = "jdbc:mysql://localhost/carsDB";
    public final static String LOGIN = "root";
    public final static String PASSWORD = "#Peniskop911911";

    public static Connection start () throws SQLException {
        return  DriverManager.getConnection(URL, LOGIN, PASSWORD);
    }

}
