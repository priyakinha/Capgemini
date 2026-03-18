package com.cg.service;

import com.cg.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    public List<Employee> getAllEmployee();
    public Employee getEmployee(int empId);
    public List<Employee>getEmployeeByName(String name);
    public Employee createEmployee(Employee emp);
    public String removeEmployee(int empId);
    public Employee updateEmployee(Employee e);
}
