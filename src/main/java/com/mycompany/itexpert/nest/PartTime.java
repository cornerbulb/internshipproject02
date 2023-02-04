/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.itexpert.nest;

/**
 *
 * @author newve
 */

    public class PartTime extends Employee{
     private float hourlypay;

    @Override
    public String toString() {
        return "PartTime{" + "hourlypay=" + hourlypay + '}';
    }

    public float getHourlypay() {
        return hourlypay;
    }

    public void setHourlypay(float hourlypay) {
        this.hourlypay = hourlypay;
    }

    public PartTime(float hourlypay, int id, String first, String last, String phone, String email, EmployeeType type) {
        super(id, first, last, phone, email, type);
        this.hourlypay = hourlypay;
    }

    public PartTime() {
    }


   

    

   
     
}
