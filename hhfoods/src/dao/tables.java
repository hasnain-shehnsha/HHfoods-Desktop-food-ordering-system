 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class tables {
    public static void main(String[] args){
        try{
            
            String userTable = "create table user(id int AUTO_INCREMENT primary key,username varchar(200),name varchar(200),email varchar(200),mobileNumber varchar(11),password varchar(200),securityQuestion varchar(200),answer varchar(200),unique (username))";
            dpoperations.setDataOrDelete(userTable, "User Table Created Successfully");
            String adminTable = "create table admin(id int AUTO_INCREMENT primary key,username varchar(200),name varchar(200),email varchar(200),mobileNumber varchar(11),password varchar(200),securityQuestion varchar(200),answer varchar(200),unique (username))";
            dpoperations.setDataOrDelete(adminTable, "admin Table Created Successfully");
            String items = "create table items(id int AUTO_INCREMENT primary key,name varchar(200),price varchar(200))";
            dpoperations.setDataOrDelete(items, "items Table Created Successfully");
            String bills = "create table bills(id int AUTO_INCREMENT primary key,purchaseID int(10),name varchar(200),mobileNumber varchar(200),email varchar(200),date varchar(50),total varchar(200),createdBy varchar(200),unique (purchaseID))";
            dpoperations.setDataOrDelete(bills, "bills Table Created Successfully");
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);}
    }
}
