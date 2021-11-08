package lesson16.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConection {

    private static final String PROPER = "src/main/resources/db/db.properties";
    Connection con = null;

    public Connection connectedToDataBase(){
        FileInputStream fileDBProperties = null;
        Properties property = new Properties();

        try {
            fileDBProperties = new FileInputStream(PROPER);
            try {
                property.load(fileDBProperties);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String dbUrl = property.getProperty("DB_URL");
        String ip = property.getProperty("IP");
        String port = property.getProperty("PORT");
        String alias = property.getProperty("ALIAS");
        String userDB = property.getProperty("USERDB");
        String pass = property.getProperty("PASS");

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver is not found. Include it in your library path ");
            e.printStackTrace();
        }

        try {
            con = DriverManager.getConnection(dbUrl + "://" + ip + ":" + port + "/" + alias, userDB, pass);
        } catch (SQLException e) {
            System.out.println("Connection: " + ip + ":" + port + " - Failed!");
            e.printStackTrace();
        }
        return con;
    }

    public void closeConnection() throws SQLException {
        con.close();
    }
}
