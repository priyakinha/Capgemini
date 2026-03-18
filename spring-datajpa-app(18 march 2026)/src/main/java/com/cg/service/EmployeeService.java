package com.cg.service;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private IEmployeeRepo erepo;

    //---------------create-------------------
    public String createEmployee(Employee emp){
        erepo.saveAndFlush(emp);             //------save if not available or update if already there
        return "Employee created...Your empId is: "+ emp.getEmpId();
    }
    //--------------------read---------------------
    public List<Employee>getAllEmployee(){
        return erepo.findAll();
    }

    //-----------------find--------------------
    public Employee getEmployee(int id){
//       Employee e= erepo.findById(id).get();
//       return e;
       Optional<Employee>op= erepo.findById(id);
       if(op.isPresent()){
           return op.get();
       }else{
           return null;
       }
    }

    //---------------delete------------------
    public String removeEmployee(int empid){
        if(getEmployee(empid)!=null) {
            erepo.deleteById(empid);
            return "Employee deleted...";
        }else{
            return "Employee not found";
        }
    }

    //------------------update-----------------
    public String updateEmployee(Employee e){
        erepo.saveAndFlush(e);
        return "Employee Updated...";
    }

    //------------find by non-primary key----------------
    public List<Employee>getEmployeeName(String name){
        return erepo.findByName(name);
    }

    //------------get employee by sal-------------
    public List<Employee> getEmployeeBySalary(Double salary){
       return  erepo.findBySalaryLessThan(salary);
    }
    //------------get employee of particular dob-------------
    public List<Employee>getEmployeeByBirth(LocalDate dob1,LocalDate dob2){
        return erepo.findByDobBetween(dob1,dob2);
    }


}
