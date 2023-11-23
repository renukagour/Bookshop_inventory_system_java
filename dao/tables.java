/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author Renuka Gour
 */
public class tables {

    public static void main(String args[]) {
        try {
            String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(100),email varchar(100),mobileNumber varchar(10),address varchar(200),password varchar(50),securityQuestion varchar(200),answer varchar(200),UNIQUE (email))";
            String adminDtails = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer) values('Admin','admin@gmail.com',1234567890,'India','admin','What is you favourite color','blue')";
            String categoryTable = "create table category (id int(10) primary key,name varchar(200)) ";
            String bookTable = "create table book(bid int(10) primary key, title varchar(200),author varchar(200), publisher varchar(200),category varchar(100), price int(100),quantity int(50))"; //instead of varchar price we created price int
            String billTable = "create table bill(billid int primary key,name varchar(200),mobileNumber varchar(200),email varchar(200),date varchar(50),total int(200),createdBy varchar(200))";
            String deleteTable = "alter table user drop column status";
            String addcolumn ="alter table bill add address varchar(200)";
//            DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
//            DbOperations.setDataOrDelete(adminDtails, "Admin Details added Successfully");
//            DbOperations.setDataOrDelete(categoryTable, "Category Table Created Successfully");
//            DbOperations.setDataOrDelete(bookTable, "Book Table Created Successfully");
//            DbOperations.setDataOrDelete(billTable, "Bill Table Created Successfully");
//            DbOperations.setDataOrDelete(deleteTable, "table deleted successfully");
             DbOperations.setDataOrDelete(addcolumn, "column added successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
