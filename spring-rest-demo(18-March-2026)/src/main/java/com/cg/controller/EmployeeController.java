package com.cg.controller;

import com.cg.entity.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employees")
//--------controller->service->repo
public class EmployeeController {
    private IEmployeeService service;
    public EmployeeController(IEmployeeService service) { //constructor injection
        super();
        this.service = service;
    }

    //--------------get all employees---------------
    @GetMapping
    public List<Employee> getEmployee(){
        return service.getAllEmployee();
    }

    //----------get by id----------------
    @GetMapping("/{eid}")
    public Employee getEmp(@PathVariable int eid){
        return service.getEmployee(eid);
    }
    //---------------get by name---------------
    @GetMapping("/name/{ename}")
    public List<Employee> getEmp(@PathVariable String ename){
        return service.getEmployeeByName(ename);
    }

    //----------create employee---------------
    @PostMapping
    public Employee createNewEmployee(@RequestBody Employee emp){
        return service.createEmployee(emp);
    }

    //---------delete employee----------------
    @DeleteMapping("/{eid}")
    public String deleteEmployee(@PathVariable int eid){
        return service.removeEmployee(eid);
    }

    //------------update employee---------------
    @PutMapping
    public Employee updateEmployee(@RequestBody Employee emp){
        return service.updateEmployee(emp);
    }


}
