package com.cg.employeeDepartment;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int deptId;
    @Column(unique = true)
    private String deptName;
    @OneToMany( cascade = CascadeType.ALL)  //annotation is inverse side but this is actually the owners side
    //@OneToMany(mappedBy="dept" ,cascade = CascadeType.ALL)-----> by 2 tables only
    private List<Employee> emp;

    public List<Employee> getEmp() {
        return emp;
    }

    public void setEmp(List<Employee> emp) {
        this.emp = emp;
    }

    Department(){}
    public Department( String deptName) {
        super();
        this.deptName=deptName;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
