package com.javarush.task.task29.task2909.human;

public class Worker extends Human{
    private double salary;
    private String company;

    public Worker(String name, int age) {
        super(name, age);
    }

    public void live() {
    }

    public double getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}