package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private int empId;
    private String name;
    private double salary;
    private String bu;
    private int age;
    private SBU businessUnit;
    public Employee(){}

    public Employee(int empId, String name, double salary, String bu, int age) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.bu = bu;
        this.age = age;
    }


    public SBU getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(SBU businessUnit) {
        this.businessUnit = businessUnit;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getbu() {
        return bu;
    }

    public void setbu(String bU) {
        this.bu = bu;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showEmployee(){
        System.out.println("=======Employee details======");
        System.out.println("Employee ID: "+empId);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);
        System.out.println("Employee BU: "+bu);
        System.out.println("Employee Age: "+age);
    }


    public void getSbuDetails() {
        System.out.println(this.businessUnit);
    }


}
