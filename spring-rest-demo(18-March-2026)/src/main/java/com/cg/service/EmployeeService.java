package com.cg.service;

import com.cg.dao.IEmployeeRepo;
import com.cg.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
 private IEmployeeRepo repo; //------to connect to db

    //-------------retrieve all the employees----------

    @Override
    public List<Employee> getAllEmployee() {
        return repo.findAll();
    }

//--------------find by id----------------------
    @Override
    public Employee getEmployee(int empId) {
        Optional<Employee>e=repo.findById(empId);
        if(e.isPresent()){
            return e.get();
        }else{
            return null;
        }
    }

    //----------Find by non primary key----------------
    @Override
    public List<Employee>getEmployeeByName(String name){
        return repo.findByName(name);
    }
//------------create employee-------------
    @Override
    public Employee createEmployee(Employee emp) {
        return repo.saveAndFlush(emp);
    }

    //----------delete employee-------------
    @Override
    public String removeEmployee(int empId) {
        if(getEmployee(empId)!=null) {
            repo.deleteById(empId);
            return "Employee Deleted Successfully...";
        }else{
            return "Employee Not Found";
        }
    }

    //-----------update employee------------
    @Override
    public Employee updateEmployee(Employee e) {
        if(getEmployee(e.getEmpId())!=null) {
            return repo.saveAndFlush(e);
        }else{
            return null;
        }
    }
}
