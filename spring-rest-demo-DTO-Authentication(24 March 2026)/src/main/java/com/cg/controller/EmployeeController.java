package com.cg.controller;

import java.util.List;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dto.EmployeeDTO;
import com.cg.entity.Employee;
import com.cg.service.IEmployeeService;

@RestController
@RequestMapping("employees")
public class EmployeeController {
	
	private IEmployeeService service;
	
	
	public EmployeeController(IEmployeeService service) {
		super();
		this.service = service;
	}

	@GetMapping(produces = {"application/json","application/xml"})
	public ResponseEntity<List<EmployeeDTO>> getXyz(HttpSession ses) {
		if(ses.getAttribute("name")!=null)
			return new ResponseEntity<List<EmployeeDTO>>(service.getAllEmployee(),HttpStatus.OK);
		else
			return new ResponseEntity("Please Login to access this API",HttpStatus.UNAUTHORIZED);
	}

	
	@GetMapping("/{eid}")
	public ResponseEntity<EmployeeDTO> getEmp(@PathVariable int eid) {
		EmployeeDTO e = service.getEmployee(eid);
		if(e!=null)
			return new ResponseEntity<EmployeeDTO>(e,HttpStatus.OK) ;
		else
			return new ResponseEntity("Employee not found",HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/name/{name}")
	public List<EmployeeDTO> getEmployeeByName(@PathVariable String name){
		return service.getEmpByName(name);
	}
	
	@PostMapping(consumes = {"application/json","application/xml"})
	public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO emp) {
		return service.createEmployee(emp);
	}
	
	@DeleteMapping("/{empid}")
	public String deleteEmployee(@PathVariable int empid) {
		return service.removeEmployee(empid);
	}
	
	@PutMapping
	public EmployeeDTO updateEmployee(@RequestBody EmployeeDTO emp) {
		return service.updateEmployee(emp);
	}
}
