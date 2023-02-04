/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.itexpert.nest;

/**
 *
 * @author newve
 */
public class Driver {

    public static void main(String args[]) {

        Employee emp1 = new Employee(67, "Helen", "David", "556530234", "hel123@gmail.com", EmployeeType.FullTime);
        Employee emp2 = new Employee(36, "Tahir", "Khan", "6303930234", "thrabc@gmail.com", EmployeeType.PartTime);
        Employee emp3 = new Employee(112, "Farwa", "Sohail", "7808969302", "san78@gmail.com", EmployeeType.PartTime);

        Department dept1 = new Department(20, "Women", ProductType.Clothing);

        dept1.getEmployeeList().add(emp1);

        Department dept2 = new Department(15, "Men", ProductType.Shoes);
        dept2.getEmployeeList().add(emp2);

        Department dept3 = new Department(98, "Girls", ProductType.Jewelery);
        dept3.getEmployeeList().add(emp3);

        Product pd1 = new Product(4, "Ring", "350", "2");
        pd1.getDepartmentList().add(ProductType.Jewelery);

        Product pd2 = new Product(5, "Dress", "450", "5");
        pd2.getDepartmentList().add(ProductType.Clothing);

        Product pd3 = new Product(23, "Sneaker", "250", "1");
        pd3.getDepartmentList().add(ProductType.Shoes);

        Clothing clo = new Clothing("L", 5, "Dress", "450", "5");
        clo.getProductList().add(pd2);

        Jewelery j = new Jewelery("8", 4, "Ring", "350", "2");
        j.getProductList().add(pd1);

        Shoes sh = new Shoes("10", 23, "Sneaker", "250", "1");
        sh.getProductList().add(pd3);

        Store st = new Store(5460, "Jcpenny", "234 North Aurora", "6304562351");
        st.getDepartmentList().add(dept1);
        st.getDepartmentList().add(dept2);
        st.getDepartmentList().add(dept3);

        st.getProductList().add(pd1);
        st.getProductList().add(pd2);
        st.getProductList().add(pd3);

        System.out.println(st);

    }
}
