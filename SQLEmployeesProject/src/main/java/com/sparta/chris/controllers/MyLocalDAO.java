package com.sparta.chris.controllers;

import com.sparta.chris.view.Printer;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class MyLocalDAO {

    private String URL = "jdbc:mysql://localhost:3306/myLocal?serverTimeZone=GMT&rewriteBatchedStatements=true";
    private Properties properties = new Properties();
    private Connection connection = null;
    private long timeTaken;

    private Connection connectToDB() {
        try {
            properties.load(new FileReader("resources/login.properties"));
//            connection= DriverManager.getConnection(URL, properties.getProperty("username"), properties.getProperty("password"));
            connection = DriverManager.getConnection(URL, System.getenv("java_username"), System.getenv("java_password"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }

    public void createTable() {
        String createTable = "CREATE TABLE employees (" +
                "emp_id INTEGER AUTO_INCREMENT PRIMARY KEY, " +
                "name_prefix VARCHAR(5), " +
                "first_name VARCHAR(30), " +
                "middle_initial CHAR, " +
                "last_name VARCHAR(30), " +
                "gender CHAR, " +
                "email VARCHAR(40), " +
                "date_of_birth DATE, " +
                "join_date DATE, " +
                "salary INTEGER)";

        Statement statement = null;
        try {
            statement = connectToDB().createStatement();
            statement.executeUpdate(createTable);
            Printer.print("Table created");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void dropTable() {
        String dropTable = "DROP TABLE employees";

        Statement statement = null;
        try {
            statement = connectToDB().createStatement();
            statement.executeUpdate(dropTable);
            Printer.print("Table dropped");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void addEmployees() {
//        dropTable();
        createTable();

        long startTime = System.currentTimeMillis();

        String insertEmployees = "INSERT INTO employees (name_prefix, first_name, middle_initial" +
                ", last_name, gender, email, date_of_birth, join_date, salary) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        MyFileReader myFileReader = new MyFileReader();
        int numberOfObjects = myFileReader.employeeObjects.size();

        try {
            PreparedStatement preparedStatement = connectToDB().prepareStatement(insertEmployees);
            for(int i=0; i<numberOfObjects; i++) {
                preparedStatement.setString(1, myFileReader.employeeObjects.get(i).getNamePrefix());
                preparedStatement.setString(2, myFileReader.employeeObjects.get(i).getFirstName());
                preparedStatement.setString(3, String.valueOf(myFileReader.employeeObjects.get(i).getMiddleName()));
                preparedStatement.setString(4, myFileReader.employeeObjects.get(i).getLastName());
                preparedStatement.setString(5, String.valueOf(myFileReader.employeeObjects.get(i).getGender()));
                preparedStatement.setString(6, myFileReader.employeeObjects.get(i).getEmail());
                preparedStatement.setObject(7, myFileReader.employeeObjects.get(i).getDateOfBirth());
                preparedStatement.setObject(8, myFileReader.employeeObjects.get(i).getJoinDate());
                preparedStatement.setInt(9, myFileReader.employeeObjects.get(i).getSalary());

                preparedStatement.addBatch();
            }
            preparedStatement.executeBatch();
            closeConnection();
            long endTime = System.currentTimeMillis();
            long timeTaken = endTime - startTime;
            Printer.print("Time taken to populate the database: " + timeTaken + "ms");
            Printer.print("Total time for migration: " + ((timeTaken + myFileReader.timeTaken) + "ms"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private void closeConnection() {
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}