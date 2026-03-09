package com.cg.EmployeeCriteriaQuery;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="criteria_employee")
public class CriteriaEmployee {
    @Id
    private int eid;
    private String name;
    private String dept;
}
