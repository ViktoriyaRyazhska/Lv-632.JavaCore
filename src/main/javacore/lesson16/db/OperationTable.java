package lesson16.db;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.*;

public class OperationTable {

    private Connection connection;

    public OperationTable(Connection connection) {
        this.connection = connection;
    }

    public void creatingTableCars() {
        Statement statement = null;
        String stringSql = "drop table if exists cars;" +
                "create table cars\n" +
                "        (\n" +
                "                id serial primary key not null,\n" +
                "                model character(15),\n" +
                "                year_of_production int\n" +
                "        );";

        try {
            statement = connection.createStatement();
            statement.executeUpdate(stringSql);
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void insertCars(String model, int year_of_production){
        PreparedStatement pstmt = null;
        String sql = "INSERT INTO cars(model, year_of_production) VALUES(?, ?)";
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, model);
            pstmt.setInt(2, year_of_production);
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void takeCar(BufferedReader reader) {
        String model = "";
        int year = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter model car: ");
            try {
                model = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Enter year: ");
            try {
                year = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            insertCars(model, year);
        }
    }

    public void getCars(BufferedReader reader){
        PreparedStatement pstmt = null;
        int year_of_production = 0;
        System.out.println("Entering year car: ");
        try {
            year_of_production = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        String sql = "SELECT id, model, year_of_production FROM cars where year_of_production = ?";
        String model = "";
        int year = 0;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, year_of_production);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        ResultSet rs = null;
        try {
            rs = pstmt.executeQuery();
            while (rs.next()) {
                model = rs.getString(2);
                year = rs.getInt(3);
                System.out.println("Car model: " + model + "year: " + year);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

