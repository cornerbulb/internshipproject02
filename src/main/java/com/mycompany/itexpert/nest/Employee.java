/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.itexpert.nest;

/**
 *
 * @author newve
 */
public class Employee {
       private int id;
    private String first;
    private String last;
    private String phone;
    private String email;
    private EmployeeType type;

    public Employee() {
    }

  
    

   
    public Employee(int id, String first, String last, String phone, String email, EmployeeType type) {
        this.id = id;
        this.first = first;
        this.last = last;
        this.phone = phone;
        this.email = email;
        this.type = type;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", first=" + first + ", last=" + last + ", phone=" + phone + ", email=" + email + ", type=" + type + '}';
    }

    
    


}
