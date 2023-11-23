/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Renuka Gour
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;
import java.sql.*;
/**
 *
 * @author Renuka Gour
 */
// creating category table
public class CategoryDao {
    public static void save(Category category){
        try {
            String query ="insert into category (id,name) values('"+category.getId()+"','"+category.getName()+"')";
        DbOperations.setDataOrDelete(query, "Category Added Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Category ID Already Exist");
        }
        
    }
  //setting and getting category   
    public static ArrayList<Category> getAllRecords(){
        ArrayList<Category> arrayList=new ArrayList<>();
        try {
            ResultSet rs=DbOperations.getData("select * from category");
            while (rs.next()) {
               Category category =new Category();
               category.setId(rs.getInt("id"));
               category.setName(rs.getString("name"));
               arrayList.add(category);
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return  arrayList;
    }
    //delete category
    public static void delete(String id) {
        String query ="delete from category where id='"+id+"'";
        DbOperations.setDataOrDelete(query, "Category Deleted Successfully");
        
    }
}