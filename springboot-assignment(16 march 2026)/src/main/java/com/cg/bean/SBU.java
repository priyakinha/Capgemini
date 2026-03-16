package com.cg.bean;

import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class SBU {
    private int sbuId;
    private String sbuName;
    private String sbuHead;
    private List<Employee> empList;

public SBU(){
    this.sbuId=101;
    this.sbuName="Product Engineering Service";
    this.sbuHead="Kiran Rao";
}
    @Override
    public String toString() {
        return "SBU{" +
                "sbuId=" + sbuId +
                ", sbuName='" + sbuName + '\'' +
                ", sbuHead='" + sbuHead + '\'' +
                '}';
    }

    public int getSbuId() {
        return sbuId;
    }

    public void setSbuId(int sbuId) {
        this.sbuId = sbuId;
    }

    public String getSbuName() {
        return sbuName;
    }

    public void setSbuName(String sbuName) {
        this.sbuName = sbuName;
    }

    public String getSbuHead() {
        return sbuHead;
    }

    public void setSbuHead(String sbuHead) {
        this.sbuHead = sbuHead;
    }


    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    public void display() {

        System.out.println("SBU Details");
        System.out.println("Code: " + sbuId);
        System.out.println("Name: " + sbuName);
        System.out.println("Head: " + sbuHead);

        System.out.println("\n=======Employee Details=====");

        for (Employee e : empList) {
            System.out.println(
                    e.getEmpId() + " " +
                            e.getName() + " " +
                            e.getSalary()+" "+
                            e.getAge()
            );
        }

    }
    public Employee getEmployee(int id){
        for(Employee e : empList)
        {
            if(e.getEmpId()==id)
                return e;
        }
        return null;
    }

}
