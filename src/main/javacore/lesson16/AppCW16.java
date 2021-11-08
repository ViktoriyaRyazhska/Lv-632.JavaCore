package lesson16;

import lesson16.db.DBConection;
import lesson16.db.OperationTable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;

public class AppCW16 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DBConection dataBase = new DBConection();
        Connection connection = dataBase.connectedToDataBase();
        OperationTable operationTable = new OperationTable(connection);

        operationTable.creatingTableCars();
        operationTable.takeCar(reader);
        operationTable.getCars(reader);

        try {
            dataBase.closeConnection();
            System.out.println("Clouse connection ! ");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
