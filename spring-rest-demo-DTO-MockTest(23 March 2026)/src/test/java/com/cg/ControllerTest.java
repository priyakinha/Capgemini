package com.cg;

import com.cg.controller.EmployeeController;
import com.cg.dto.EmployeeDTO;
import com.cg.service.IEmployeeService;
import org.springframework.http.MediaType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.bean.override.mockito.MockitoSpyBean;

import org.springframework.test.web.servlet.MockMvc;
import java.time.LocalDate;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@WebMvcTest(EmployeeController.class)
public class ControllerTest {
    @Autowired
    private MockMvc mockMvc;  //MockMvc has all the get,put,post delete urls
    @MockitoBean
    private IEmployeeService service;

    //----getEmpByIdTest-------------
    @Test
    void getEmpByIdApiTest() throws Exception{
        EmployeeDTO edto=new EmployeeDTO("Priya", LocalDate.of(2001,5,11),56000.0);
        when(service.getEmployee(1)).thenReturn(edto);
        mockMvc.perform(get("/employees/1")).andExpect(status().isOk())
                .andExpect(jsonPath("$.fullName").value("Priya"))
                .andExpect(jsonPath("$.salary").value(56000.0));
    }

    //------getAllEmp---------
    @Test
    void getAllEmployeeTest() throws Exception{
        EmployeeDTO edto1=new EmployeeDTO("Priya", LocalDate.of(2001,5,11),56000.0);
        EmployeeDTO edto2=new EmployeeDTO("GV", LocalDate.of(2002,8,13),96000.0);
        EmployeeDTO edto3=new EmployeeDTO("GP", LocalDate.of(2007,5,12),35000.0);
        when(service.getAllEmployee()).thenReturn(List.of(edto1,edto2,edto3));
        mockMvc.perform(get("/employees")).andExpect(status().isOk())
                .andExpect(jsonPath("$[2].fullName").value("GP"));
    }

    //-------------get By Name-----------
    @Test
    void getByNameTest() throws Exception{
        EmployeeDTO edto=new EmployeeDTO("Priya", LocalDate.of(2001,5,11),56000.0);
        when(service.getEmpByName("Priya")).thenReturn(List.of(edto));
        mockMvc.perform(get("/employees/name/Priya")).andExpect(status().isOk())
                .andExpect(jsonPath("$[0].fullName").value("Priya"));
    }

    //-------delete---------
    @Test
    void deleteByIdTest() throws Exception{
        EmployeeDTO edto=new EmployeeDTO("Priya", LocalDate.of(2001,5,11),56000.0);
        when(service.removeEmployee(1)).thenReturn("Employee deleted");
        mockMvc.perform(delete("/employees/1")).andExpect(status().isOk())
                .andExpect(content().string("Employee deleted"));
    }

    //-------postTest---------
    @Test
    void createEmployeeTest() throws Exception{
        String json = """
        {
          "fullName":"Priya",
          "dateOfBirth":"2001-05-11",
          "salary":56000
        }
        """;
        EmployeeDTO dto = new EmployeeDTO("Priya", LocalDate.of(2001,5,11),56000.0);
        when(service.createEmployee(any(EmployeeDTO.class))).thenReturn(dto);
        mockMvc.perform(post("/employees")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.fullName").value("Priya"));

    }

    //-------putTest----------
    @Test
    void updateEmployeeTest() throws Exception{
        String json = """
    {
      "employeeId": 1,
      "fullName": "Updated",
      "dateOfBirth": "2001-05-11",
      "salary": 60000
    }
    """;
        EmployeeDTO dto = new EmployeeDTO("Updated", LocalDate.of(2001,5,11),60000.0);
        dto.setEmployeeId(1);
        when(service.updateEmployee(any(EmployeeDTO.class))).thenReturn(dto);
        mockMvc.perform(put("/employees")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.fullName").value("Updated"));
    }
}
