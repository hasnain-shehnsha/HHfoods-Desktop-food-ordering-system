/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import dao.dpoperations;
import java.sql.Array;
import java.util.ArrayList;
import model.bills;
/**
 *
 * @author Lenovo
 */
public class billDao {
    public static String getId(){
        int id = 1;
        try{
            ResultSet rs = dpoperations.getData("select max(id) from bills");
            if(rs.next()){
                id = rs.getInt(1);
                id = id + 1;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }
    public static void save(bills bill, String msg){
        String query = "insert into bills(purchaseID,name,mobileNumber,email,date,total,createdBy) values("+bill.getPurchaseID()+",'"+bill.getName()+"','"+bill.getMobileNumber()+"','"+bill.getEmail()+"','"+bill.getDate()+"','"+bill.getTotal()+"','"+bill.getCreatedBy()+"')";
        dpoperations.setDataOrDelete(query, msg);
    }
    public static ArrayList<bills> getAllRecordsByInc(String date){
        ArrayList<bills> arrayList = new ArrayList<>();
        try{
            ResultSet rs = dpoperations.getData("select * from bills where date like '%"+date+"%'");
            while(rs.next()){
                bills bill = new bills();
            
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setMobileNumber(rs.getString("mobileNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setPurchaseID(rs.getInt("purchaseID"));
                bill.setTotal(rs.getString("total"));
                bill.setCreatedBy(rs.getString("createdBy"));
                arrayList.add(bill);
   
            }
            
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
}
