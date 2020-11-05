package com.javalesson.domainmodel;

public class Employee {

    private static int id;
    private String position;
    private String name;
    private int salary;

    public Employee(String name, String position, int salary) {
        id = id++;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public static int getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
