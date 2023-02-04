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
public class Product {
     int id;
    private String name;
    private String price;
    private String qty;
    private ArrayList<Product> productList = new ArrayList<Product>();
    private ArrayList<ProductType> departmentList = new ArrayList<ProductType>();

    public Product() {
    }

  
    

    public Product(int id, String name, String price, String qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public ArrayList<ProductType> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(ArrayList<ProductType> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + ", productList=" + productList + ", departmentList=" + departmentList + '}';
    }

   

    
    
    
}
