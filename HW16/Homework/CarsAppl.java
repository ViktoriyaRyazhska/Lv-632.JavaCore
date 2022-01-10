package lesson016b;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class CarsAppl {
	  private static final String DBPROP = "src\\resources\\db\\db.properties";
	  static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	  static final String DB_URL = "jdbc:mysql://localhost/Cars";
	  public static Connection conn = null;
	  public static Statement stmt = null;
	  public static PreparedStatement pstmt = null;

	  public static void connectToDB() {
			System.out.print("Connecting to database..");
			visual();
			try (FileInputStream f = new FileInputStream(DBPROP)) {
				  Properties pros = new Properties();
				  pros.load(f);
				  final String USER = pros.getProperty("user");
				  final String PASS = pros.getProperty("password");
				  Class.forName(JDBC_DRIVER);
				  conn = DriverManager.getConnection(DB_URL, USER, PASS);
			} catch (SQLException | ClassNotFoundException | IOException e) {
				  System.out.println(e.getMessage());
			}
	  }

	  public static void dropTable() throws SQLException {
//			String sql = "TRUNCATE TABLE Cars";
			String sql = "DROP TABLE IF EXISTS Cars";
			stmt.executeUpdate(sql);
	  }

	  public static void createTable() throws SQLException {
			String sql = "CREATE TABLE IF NOT EXISTS Cars " + "(id INTEGER NOT NULL AUTO_INCREMENT, "
						+ " model VARCHAR(255), " + " yearOfProd INTEGER, " + " PRIMARY KEY (id))";
			stmt.executeUpdate(sql);
	  }

	  public static void addCar(String model, int yearOfProd) throws SQLException {
			String sql = "INSERT INTO Cars(model, yearOfProd) VALUES(?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, model);
			pstmt.setInt(2, yearOfProd);
			pstmt.executeUpdate();
	  }

	  public static void getAllCars() throws SQLException {
			stmt = conn.createStatement();
			String sql = "SELECT id, model, yearOfProd FROM Cars";
			ResultSet rs = stmt.executeQuery(sql);
			printResultSet(rs);
	  }

	  public static void findByOldest(int count) throws SQLException {
			System.out.println("Oldest car: ");
			System.out.println("Found cars: " + count);
			String sql = "SELECT id, model, yearOfProd FROM Cars WHERE yearOfProd = (SELECT MIN(yearOfProd) FROM Cars)";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			printResultSet(rs);
	  }

	  public static int countfindByOldest() throws SQLException {
			int count = 0;
			String sql = "SELECT COUNT(*) FROM Cars WHERE yearOfProd = (SELECT MIN(yearOfProd) FROM Cars)";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				  count = (rs.getInt(1));
			}
			return count;
	  }

	  public static void deleteMinRecords(int count) throws SQLException {
			System.out.println("Deleting record with lowest year => ");
			String sql = "DELETE FROM CARS ORDER BY yearOfProd LIMIT " + count;
			stmt.executeUpdate(sql);
	  }

	  private static void printResultSet(ResultSet rs) throws SQLException {
			System.out.printf("| %-1s |       %-12s | %-18s | \n", "ID", "Model", "Year of production");
			while (rs.next()) {
				  int id = rs.getInt("id");
				  String model = rs.getString("model");
				  int year = rs.getInt("yearOfProd");

				  System.out.printf("| %-1s  | %-18s |        %-11d | \n", id, model, year);

			}
			System.out.println("-------------------------------------------------");
	  }

	  public static void visual() {
			String str[] = { ".", ".", ".", ".", ".", ".", ".", ".", ".", "." };
			for (int i = 0; i < 10; i++) {
				  try {
						Thread.sleep(200);
				  } catch (InterruptedException e) {
						e.printStackTrace();
				  }
				  System.out.print(str[i]);
			}
			  System.out.println("\n");
	  }

	  
	  public static void main(String[] args) {
			try {
				  connectToDB();
				  stmt = conn.createStatement();
				  dropTable();
				  createTable();
				  addCar("Audi A6", 2014);
				  addCar("Volvo XC40", 2018);
				  addCar("Skoda Octavia", 2002);
				  addCar("Daewoo Lanos", 2009);
				  addCar("ÂÀÇ-2109", 2002);
				  addCar("Ford Focus", 2015);
				  addCar("Nissan Rogue", 2020);
				  addCar("Mitsubishi Lancer", 2016);
				  getAllCars();
				  findByOldest(countfindByOldest());
				  countfindByOldest();
				  deleteMinRecords(countfindByOldest());
				  getAllCars();
			} catch (SQLException se) {
				  System.out.println(se.getMessage());
			} finally {
				  try {
						if (stmt != null)
							  stmt.close();
						if (conn != null)
							  conn.close();
				  } catch (SQLException se) {
						System.out.println(se.getMessage());
				  }
			}
	  }
}