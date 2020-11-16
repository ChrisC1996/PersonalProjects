package com.sparta.chris.controllers;

import com.sparta.chris.models.Employee;
import com.sparta.chris.view.Printer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class MyFileReader {

    public static ArrayList<Employee> employeeObjects = new ArrayList<>();
    public static long timeTaken;

    public void readFile() {
        long startTime = System.currentTimeMillis();
        try {
            File employees = new File("EmployeeRecords.csv");
            BufferedReader reader = new BufferedReader(new java.io.FileReader(employees));

            HashSet<String> employeesSet = new HashSet<>();

            String attributes = reader.readLine();
//            Printer.print(attributes);

            while(reader.read() != -1) {
                String employeeData = reader.readLine();
                String[] fields = employeeData.split(",");
                if(employeesSet.add(employeeData)) {
                    Employee employee = new Employee();
                    employee.createEmployee(fields);
                    employeeObjects.add(employee);
                }
            }

            MyLocalDAO myLocalDAO = new MyLocalDAO();
            long endTime = System.currentTimeMillis();
            timeTaken = endTime - startTime;
            Printer.print("Reading the file took: " + timeTaken + "ms");
            myLocalDAO.addEmployees();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
