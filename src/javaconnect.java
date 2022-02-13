/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nimesha
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    static Connection conn;
    
    public static Connection connecrDb(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        //conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","vayomie1999");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return conn;
    }
    public static void main(String args[]) {
Login ob=new Login();
ob.setVisible(true);
}
}

