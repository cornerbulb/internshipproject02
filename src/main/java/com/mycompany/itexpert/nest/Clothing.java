/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.itexpert.nest;

/**
 *
 * @author newve
 */

   public class Clothing extends Product {

    String size; 

    public Clothing() {
    }

   

    public Clothing(String size, int id, String name, String price, String qty) {
        super(id, name, price, qty);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Clothing{" + "size=" + size + '}';
    }
    
}
