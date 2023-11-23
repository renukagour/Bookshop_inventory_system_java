/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Renuka Gour
 */
public class UserDao {

    public static void save(User user) {
        String query = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('" + user.getName() + "','" + user.getEmail() + "','" + user.getMobileNumber() + "','" + user.getAddress() + "','" + user.getPassword() + "','" + user.getSecurityQuestion() + "','" + user.getAnswer() + "','false')";
        DbOperations.setDataOrDelete(query, "Registered Successfully ");
    }

    public static User login(String email, String password) {
        User user = null;
        try {
            ResultSet rs = DbOperations.getData("select * from user where email='" + email + "' and password='" + password + "'");
            while (rs.next()) {
                user = new User();
//                user.setStatus(rs.getString("status"));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static User getSecurityQuestion(String email) {
        User user = null;
        try {
            ResultSet rs = DbOperations.getData("select * from user where email='" + email + "'");
            while (rs.next()) {
                user = new User();
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setAnswer(rs.getString("answer"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    //method for change password in forgot password
    public static void update(String email, String newPassword) {
        String query = "update user set password = '" + newPassword + "' where email='" + email + "'";
        DbOperations.setDataOrDelete(query, "Password Changed Successfully");
    }

    //METHOD TO ABSTRCT DATA TO VERIFY USER FORM
    public static ArrayList<User> getAllRecords(String email) {
        ArrayList<User> arrayList = new ArrayList<>();
        try {
            //query
            ResultSet rs = DbOperations.getData("select * from user where email like '%" + email + "%'");
            while (rs.next()) {
                User user = new User();
                //set name                            //Column Name
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setMobileNumber(rs.getString("mobilenumber"));
                user.setAddress(rs.getString("address"));
                user.setSecurityQuestion(rs.getString("securityQuestion"));
//                user.setStatus(rs.getString("status"));
                //add this in arraylist
                arrayList.add(user);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    //method to change status of user in verify user
    public static void changeStatus(String email, String status) {
        //query
        String query = "update user set status = '" + status + "' where email= '" + email + "' ";
        DbOperations.setDataOrDelete(query, "Status Changed Successfully");
    }

    //method for operations in  change password form
    public static void changePassword(String email, String OldPassword, String newPassword) {
        try {
            ResultSet rs = DbOperations.getData("select * from  user where email = '" + email + "' AND  password = '" + OldPassword + "'");
            if (rs.next()) {
                update(email, newPassword);
            } else {
                JOptionPane.showMessageDialog(null, "old Password is Wrong");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //For Change Security Question
    public static void changeSecurityQuestion(String email, String Password, String securityQuestion, String answer) {
        try {
            ResultSet rs = DbOperations.getData("select * from  user where email = '" + email + "' AND  password = '" + Password + "'");
            if (rs.next()) {
              //calling method
                update(email, securityQuestion, answer);
              
            } else {
                JOptionPane.showMessageDialog(null, "Password is Wrong");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e); //display exception message
        }
    }
    
    //method used in above method 
    public static void update(String email, String securityQuestion ,String answer ){
        String query ="update user set securityquestion = '"+securityQuestion+"',answer='"+answer+"' where email = '"+email+"'";
        DbOperations.setDataOrDelete(query, "Security Question Changed Successfully");
        
    }
}
