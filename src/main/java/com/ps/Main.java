package com.ps;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {

            BufferedReader bufReader = new BufferedReader(new FileReader("employee.txt"));
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter("write.csv"));
            String line;
//reading
            while ((line = bufReader.readLine()) != null) {
                String[] splitLine = line.split("\\|");
                // instead use: String[] splitLine = line.split(Pattern.quote("|"));
                long id = Long.parseLong(splitLine[0]);
                String name = splitLine[1];
                float hoursWorked = Float.parseFloat(splitLine[2]);
                float payRate = Float.parseFloat(splitLine[3]);

                // System.out.printf(" Id: %d,Name: %s , Hours Worked: %.2f , Pay Rate: %.2f \n", id, name, hoursWorked, payRate);
                // System.out.println(Arrays.toString(splitLine));

                Employee employee = new Employee(id, name, hoursWorked, payRate);
                System.out.printf("Employee ID: %d, Name: %s, Hours: %.2f, Pay Rate: %.2f \n",
                        employee.getEmployeeId(),
                        employee.getName(),
                        employee.getHoursWorked(),
                        employee.getPayRate());
// Writing on a file

                bufWriter.write(String.format("Employee ID: %d, Name: %s, Hours: %.2f, Pay Rate: %.2f \n",
                        employee.getEmployeeId(),
                        employee.getName(),
                        employee.getHoursWorked(),
                        employee.getPayRate()));


            }
            System.out.println("Printed Successfully.");
            bufWriter.close();

            bufReader.close();
        }catch (Exception e){
            e.printStackTrace();

        }

    }
}