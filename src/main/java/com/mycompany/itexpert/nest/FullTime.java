/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.itexpert.nest;

/**
 *
 * @author newve
 */

    public class FullTime extends Employee{
      private float salary;

    public FullTime(float salary, int id, String first, String last, String phone, String email, EmployeeType type) {
        super(id, first, last, phone, email, type);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "FullTime{" + "salary=" + salary + '}';
    }

    public FullTime() {
    }

  

    }


