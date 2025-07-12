/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import javax.swing.JOptionPane;
import model.user;
import java.sql.*;
/**
 *
 * @author Lenovo
 */
public class userDao {
    public static void save(user user){
        String query = "insert into user(username,name,email,mobileNumber,password,securityQuestion,answer) value('"+user.getUsername()+"','"+user.getName()+"','"+user.getEmail()+"','"+user.getPhonenumber()+"','"+user.getPassword()+"','"+user.getSecurityQyestion()+"','"+user.getAnswer()+"')";
        dpoperations.setDataOrDelete(query, "Registered Successfully! :)");
//        String query = "insert into admin(username,name,email,mobileNumber,password,securityQuestion,answer) value('"+"admin"+"','"+"HHfoods"+"','"+"hhfoods@gmail.com"+"','"+"03404386378"+"','"+"hhfoods"+"','"+"Complete it hh....s?"+"','"+"hhfoods"+"')";
//        dpoperations.setDataOrDelete(query, "Registered Successfully! :)");
        
    }
    public static user login(String username, String password){
        user user=null;
        try{
            ResultSet rs = dpoperations.getData("select *from user where username='"+username+"' and password='"+password+"'");
            while(rs.next()){
                user = new user();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPhonenumber(rs.getString("mobileNumber"));
                user.setPassword(rs.getString("password"));

                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
    public static admin login1(String username, String password){
        admin admin=null;
        try{
            ResultSet rs = dpoperations.getData("select *from admin where username='"+username+"' and password='"+password+"'");
            while(rs.next()){
                admin = new admin();
                admin.setId(rs.getInt("id"));
                admin.setUsername(rs.getString("username"));
                admin.setName(rs.getString("name"));
                admin.setEmail(rs.getString("email"));
                admin.setPhonenumber(rs.getString("mobileNumber"));
                admin.setPassword(rs.getString("password"));
               

                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return admin;
    }
    public static user getSecurityQuestion(String username){
        user user = null;
        try{
            ResultSet rs = dpoperations.getData("select *from user where username = '"+ username+"'");
            while(rs.next()){
                user = new user();
                
                user.setSecurityQyestion(rs.getString("securityquestion"));
                user.setAnswer(rs.getString("answer"));

                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
    public static void update(String username, String newPasssword){
        String query = "update user set password = '"+ newPasssword + "' where username = '"+ username + "'";
        dpoperations.setDataOrDelete(query, "Password Change Successfully!");
    }
    public static String getPrice(int id){
        String price = "0";
        ResultSet rs = dpoperations.getData("select *from items where id = "+ id);

        try{
            
        while(rs.next()){
            price = rs.getString("price");
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return price;
        
    }
    public static void updatePrice(String price, int id){
        String query = "update items set price = '"+ price + "' where id = "+ id;
        dpoperations.setDataOrDelete(query, "Price Change Successfully!");
    }
    public static void updatePassword(String username, String newPasssword){
        String query = "update user set password = '"+ newPasssword + "' where username = '"+ username+"'";
        dpoperations.setDataOrDelete(query, "Password Change Successfully!");
    }
    public static user getOldPassword(String username){
        user user = null;
        try{
            ResultSet rs = dpoperations.getData("select *from user where username = '"+ username+"'");
            while(rs.next()){
                user = new user();
                
                user.setPassword(rs.getString("password"));
                

                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
    public static admin getOldPasswordA(String username){
        admin admin = null;
        try{
            ResultSet rs = dpoperations.getData("select *from admin where username = '"+ username+"'");
            while(rs.next()){
                admin = new admin();
                
                admin.setPassword(rs.getString("password"));
                

                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return admin;
    }
    public static void updatePasswordA(String username, String newPasssword){
        String query = "update admin set password = '"+ newPasssword + "' where username = '"+ username+"'";
        dpoperations.setDataOrDelete(query, "Password Change Successfully!");
    }
    
}
