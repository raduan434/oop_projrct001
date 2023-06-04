/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poject;
import java.sql.*;
/**
 *
 * @author User
 */
public class connectionprovider {
public static Connection getCon()    
{
 try 
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gms","root","Rabbi12354@");
return con;
}
catch(Exception e)
{
return null;
}


}
}