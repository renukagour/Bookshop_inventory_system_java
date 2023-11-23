/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Book;

/**
 *
 * @author Renuka Gour
 */
public class BookDao {

    //getting book details so void
    public static void save(Book book) {
        try {
            String query = "insert into book(bid,title,author,publisher,category,price,quantity) values('" + book.getBid() + "','" + book.getTitle() + "','" + book.getAuthor() + "','" + book.getPublisher() + "','" + book.getCategory() + "','" + book.getPrice() + "','" + book.getQuantity() + "')";
            //execute query
            DbOperations.setDataOrDelete(query, "Book Added Successfully ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Book ID Already Exist");
        }

    }

    public static ArrayList<Book> getAllRecords() {
        ArrayList<Book> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select *from book");
            while (rs.next()) {
                Book book = new Book();
                book.setBid(rs.getInt("bid"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setPublisher(rs.getString("publisher"));
                book.setCategory(rs.getString("category"));
                book.setPrice(rs.getInt("price"));
                book.setQuantity(rs.getInt("quantity"));
                //add this to arraylist
                arrayList.add(book);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    //dispay to data to table in book table
    public static void update(Book book) {
        String query = "update book set title='" + book.getTitle() + "',author='" + book.getAuthor() + "',publisher='" + book.getPublisher() + "',category='" + book.getCategory() + "',price='" + book.getPrice() + "',quantity='" + book.getQuantity() + "' where bid='" + book.getBid() + "'";
        DbOperations.setDataOrDelete(query, "Book Updated Successfully");
    }

    public static void delete(String bid) {
        String query = "Delete from book where bid='" + bid + "'";
        DbOperations.setDataOrDelete(query, "Book Deleted Successfully");
    }

    //for place order
    public static ArrayList<Book> gettAllRecordsByCategory(String category) {
        ArrayList<Book> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from book where category='" + category + "' ");
            while (rs.next()) {
                Book book = new Book();
                book.setBid(rs.getInt("bid"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setPublisher(rs.getString("publisher"));
                book.setCategory(rs.getString("category"));
                book.setPrice(rs.getInt("price"));
                book.setQuantity(rs.getInt("quantity"));
                //add this to arraylist
                arrayList.add(book);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static ArrayList<Book> filterRecordsBytitle(String title, String category) {
        ArrayList<Book> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select *from book where title like '%" + title + "%' and category='" + category + "' ");
            while (rs.next()) {
                Book book = new Book();
                book.setBid(rs.getInt("bid"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setPublisher(rs.getString("publisher"));
                book.setCategory(rs.getString("category"));
                book.setPrice(rs.getInt("price"));
                book.setQuantity(rs.getInt("quantity"));
                //add this to arraylist
                arrayList.add(book);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    //get data to title ,price text
    public static Book getBookBytitle(String title) {
        Book book = new Book();
        try {
            ResultSet rs = DbOperations.getData("select *from book where title='" + title + "'");
            while (rs.next()) {

                book.setTitle(rs.getString(2));

                book.setCategory(rs.getString(3));
                book.setPrice(rs.getInt(6));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return book;
    }
    
    
}
