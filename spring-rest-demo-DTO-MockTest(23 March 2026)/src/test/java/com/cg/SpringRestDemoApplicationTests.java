package com.cg;
import com.cg.dao.IEmployeeRepo;
import com.cg.dto.EmployeeDTO;
import com.cg.dto.EntityMapper;
import com.cg.entity.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


@SpringBootTest
@ExtendWith(MockitoExtension.class)
class SpringRestDemoApplicationTests {

	//@Autowired
	@Mock
	private IEmployeeRepo repo;
	@InjectMocks //creates a real object of EmployeeService and Automatically injects all mocks into it
	private EmployeeService service;

//	@Test
//	void testEmployeeById(){
//		assertNotNull(service.getEmployee(152));
//		assertThrows(EmployeeNotFoundException.class,()->service.getEmployee(222));
//		assertEquals("Priya",service.getEmployee(402).getFullName());
//	}

	//-----------Test getEmpById-----------
	@Test
	void testEmployeeById(){
		EmployeeDTO eDto=new EmployeeDTO("Priya", LocalDate.of(2004,6,16),3400.00);
		eDto.setEmployeeId(521);
		Employee emp= EntityMapper.convertObjectToEntity(eDto);  //bcz service dont work with dto
		Optional<Employee> op=Optional.of(emp);
		when(repo.findById(521)).thenReturn(op);
		assertNotNull(service.getEmployee(521));
	}

	@Test
	void TestEmployeeByIdWithException(){
		when(repo.findById(202)).thenThrow(EmployeeNotFoundException.class);
		assertThrows(EmployeeNotFoundException.class,()->service.getEmployee(202)); //Test will PASS only if this exception is thrown
	}

	//-------Test getEmpByName--------------
	@Test
	void TestGetEmpByName(){
		List<Employee>li=new ArrayList<Employee>();
		EmployeeDTO eDto=new EmployeeDTO("GV", LocalDate.of(2002,5,11),5400.00);
		eDto.setEmployeeId(221);
		li.add(EntityMapper.convertObjectToEntity(eDto));
		when(repo.findByName("GV")).thenReturn(li);
		assertNotNull(service.getEmpByName("GV"));
	}


	//-----Test getAllEmployee-------------------
	@Test
	void TestGetAllEmployee(){
		List<Employee>li=new ArrayList<Employee>();
		EmployeeDTO eDto=new EmployeeDTO("GV", LocalDate.of(2002,5,11),5400.00);
		eDto.setEmployeeId(221);
		li.add(EntityMapper.convertObjectToEntity(eDto));
		when(repo.findAll()).thenReturn(li);
		assertNotNull(service.getAllEmployee());
	}


	//-----Test DeleteEmployee-------------
	@Test
	void TestDeleteEmployee(){
		EmployeeDTO eDto=new EmployeeDTO("Senior", LocalDate.of(2007,5,6),85000.00);
		eDto.setEmployeeId(20);
		Employee emp=EntityMapper.convertObjectToEntity(eDto);
		when(repo.findById(20)).thenReturn(Optional.of(emp));
		String result=service.removeEmployee(20);
		verify(repo).deleteById(20);
		assertEquals("Employee Deleted....", result);

	}

	@Test
	void TestDeleteEmployee_NotFound(){
		when(repo.findById(20)).thenReturn(Optional.empty());
		String result = service.removeEmployee(20);
		verify(repo, never()).deleteById(20);
		assertEquals("Employee not found", result);
	}


	//------Test createEmployee--------
	@Test
	void TestCreateEmployee(){
		EmployeeDTO eDto=new EmployeeDTO("GP", LocalDate.of(2001,8,9),7400.00);
		eDto.setEmployeeId(312);
		Employee emp = EntityMapper.convertObjectToEntity(eDto);
		when(repo.saveAndFlush(any(Employee.class))).thenReturn(emp);
		EmployeeDTO result=service.createEmployee(eDto);
		assertEquals(eDto.getEmployeeId(),result.getEmployeeId());
		assertEquals(eDto.getFullName(),result.getFullName());
	}

	//-----------Test updateEmployee------------------
	@Test
	void TestUpdateEmployee(){
		EmployeeDTO existingDto = new EmployeeDTO("OldName", LocalDate.of(2000,1,1),5000);
		existingDto.setEmployeeId(671);
		Employee existing = EntityMapper.convertObjectToEntity(existingDto);

		EmployeeDTO eDto = new EmployeeDTO("Updated", LocalDate.of(2009,3,19),62000.00);
		eDto.setEmployeeId(671);

		when(repo.findById(671)).thenReturn(Optional.of(existing));

		Employee updated = EntityMapper.convertObjectToEntity(eDto);

		when(repo.saveAndFlush(any(Employee.class))).thenReturn(updated);
		EmployeeDTO result = service.updateEmployee(eDto);
		assertNotNull(result);

		assertEquals(eDto.getFullName(), result.getFullName());
		verify(repo).saveAndFlush(any(Employee.class));

	}
}
