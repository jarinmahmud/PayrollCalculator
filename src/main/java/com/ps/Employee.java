package com.ps;

public class Employee {

    private long employeeId;
    private String name;
    private float hoursWorked;
    private float payRate;

    public Employee(long employeeId, String name, float hoursWorked, float payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }
    public float calculateGrossPay(){
        return this.hoursWorked * this.payRate;

    }
    public long getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getPayRate() {
        return this.payRate;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }


    @Override
    public String toString() {
        return "Employee{" +

                ", name='" + name + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", payRate=" + payRate +
                '}';
    }
}
