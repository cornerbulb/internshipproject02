/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.itexpert.nest;

import java.util.ArrayList;

/**
 *
 * @author newve
 */
public class Department {
    private int id;
    private String name;
    private ProductType type;
    private ArrayList<Department> departmentList = new ArrayList<Department>();
    private ArrayList<Employee> employeeList = new ArrayList<Employee>();

    public Department() {
    }

   

    public Department(int id, String name, ProductType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public ArrayList<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(ArrayList<Department> departmentList) {
        this.departmentList = departmentList;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name=" + name + ", type=" + type + ", departmentList=" + departmentList + ", employeeList=" + employeeList + '}';
    }

   
   

  
    
   
    

   
    
    
}
