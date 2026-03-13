package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    private int empId;
    private String name;
    @Autowired
    @Qualifier("add")
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printDetails(){
        System.out.println("Employee id is: "+empId);
        System.out.println("Employee name is: "+name);
        System.out.println("=======Address=======");
        System.out.println("City: "+address.getCity());
        System.out.println("Country: "+address.getCountry());
        System.out.println("Zip: "+address.getZip());
    }
}
