/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Bill;

/**
 *
 * @author Renuka Gour
 */
public class BillDao {

    public static String getId() {
        int billid = 1;
        try {
            ResultSet rs = DbOperations.getData("select max(billid)from bill");
            if (rs.next()) {
                billid = rs.getInt(1);
                billid = billid + 1;

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(billid);
    }

//method to insert bill details
    public static void save(Bill bill) {
        String query = "insert into bill values('" + bill.getId() + "','" + bill.getName() + "','" + bill.getMobileNumber() + "','" + bill.getEmail() + "','" + bill.getDate() + "','" + bill.getTotal() + "','" + bill.getCreatedBy() + "','" + bill.getAddress() + "')";
        DbOperations.setDataOrDelete(query, "Bill Details Added Successfully");
    }

    //method to get values in view bills and place Order Details
    public static ArrayList<Bill> getAllRecordsByInc(String date) {
        ArrayList<Bill> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select *from bill where date like '%" + date + "%'");
            while (rs.next()) {
                Bill bill = new Bill();
                bill.setId(rs.getInt("billid"));
                bill.setName(rs.getString("name"));
                bill.setMobileNumber(rs.getString("mobileNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getInt("total"));
                bill.setCreatedBy(rs.getString("createdBy"));
                bill.setAddress(rs.getString("address"));
                arrayList.add(bill);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return arrayList;
    }

    public static ArrayList<Bill> getAllRecordsByDesc(String date) {
        ArrayList<Bill> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from bill where date like '%" + date + "%' order By billid DESC");
            while (rs.next()) {
                Bill bill = new Bill();
                bill.setId(rs.getInt("billid"));
                bill.setName(rs.getString("name"));
                bill.setMobileNumber(rs.getString("mobileNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getInt("total"));
                bill.setCreatedBy(rs.getString("createdBy"));
                bill.setAddress(rs.getString("address"));
                arrayList.add(bill);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return arrayList;
    }
}
