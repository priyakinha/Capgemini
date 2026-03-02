package com.cg.dao;

import java.sql.*;
import java.util.List;

import com.cg.bean.Employee;

public class EmployeeDao implements IEmployeeDao{
    private static Connection con;
    static {
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Priya@#123");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @Override
    public String saveEmployee(Employee emp) {
        try {
            PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");
            ps.setString(1, emp.getEmpid());
            ps.setString(2, emp.getName());
            ps.setString(3, emp.getEmail());
            ps.setString(4, emp.getDob());
            int rows=ps.executeUpdate();
            if(rows>0)
                return "Employee Created";
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "Employee Not Created";
    }

    @Override
    public Employee findEmployee(String empid) {
        try {
            PreparedStatement ps = con.prepareStatement("select * from employee where eid=?");
            ps.setString(1,empid);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Employee(rs.getString("ename"),
                        rs.getString("email"),
                        rs.getString("dob"));
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Employee> getAll() {
        try{
          Statement stat=con.createStatement();
          ResultSet rs=stat.executeQuery("select * from employee");
          while(rs.next()){
              System.out.println(rs.getString("ename")+"\t"+rs.getString("email")+"\t"+rs.getString("dob"));
          }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String updateEmployeeName(String empid, String newName) {
        try{
            PreparedStatement ps=con.prepareStatement("update employee set ename=? where eid=?");
            ps.setString(1,newName);
            ps.setString(2,empid);
            int rows=ps.executeUpdate();
            if(rows>0){
                System.out.println("Rows Updated...");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Name not found";
    }

    @Override
    public String deleteEmployee(String empid) {
        try {
            PreparedStatement ps = con.prepareStatement("delete from employee where eid = ?");
            ps.setString(1, empid);
            int rows = ps.executeUpdate();
            if (rows > 0)
                return "Employee Deleted";
            return "Employee Not Found";

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Employee Not deleted";
    }

}