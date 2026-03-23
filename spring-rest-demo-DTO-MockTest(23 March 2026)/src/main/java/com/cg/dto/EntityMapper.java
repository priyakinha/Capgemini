package com.cg.dto;

import com.cg.entity.Employee;

public class EntityMapper {
	// DTO → Entity
	public static Employee convertObjectToEntity(EmployeeDTO edto) {       //Takes data from DTO and creates an Employee entity object.
		return new Employee(edto.getEmployeeId(),edto.getFullName(),edto.getDob(),edto.getSalary());
	}
	// Entity → DTO
	public static EmployeeDTO convertEntityToObject(Employee emp) { //Takes data from Entity and creates a DTO object for sending to client
		return new EmployeeDTO(emp.getEmpid(),emp.getName(),emp.getDob(),emp.getSal());
	}
}
