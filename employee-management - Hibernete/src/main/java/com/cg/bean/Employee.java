package com.cg.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Override
    public String toString() {
        return "Employee{" +
                "empid='" + eid + '\'' +
                ", name='" + ename + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
    @Id
    private String eid;
    private String ename;
    private String email;
    private String dob;
    public Employee(){}

    public Employee(String name, String email, String dob) {
        this.ename = name;
        this.email = email;
        this.dob = dob;
    }
    public String getEmpid() {
        return eid;
    }
    public void setEmpid(String empid) {
        this.eid = empid;
    }
    public String getName() {
        return ename;
    }
    public void setName(String name) {
        this.ename = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }


}