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
    public static void main(String args[]){
        try{
            String userTable="create table user(id int AUTO_INCREMENT primary key,name varchar(100),email varchar(100),mobileNumber varchar(10),address varchar(200),password varchar(50),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE (email))";
            String adminDtails="insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('Admin','admin@gmail.com',1234567890,'India','admin','What is you favourite color','blue','true')";
            String categoryTable="create table category (id int AUTO_INCREMENT primary key,name varchar(200)) ";
            DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
            DbOperations.setDataOrDelete(adminDtails, "Admin Details added Successfully");
            DbOperations.setDataOrDelete(categoryTable, "Category Table Created Successfully");
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
       
    
}
