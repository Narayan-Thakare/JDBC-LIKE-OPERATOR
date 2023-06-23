package controller;

import java.sql.*;
import java.util.Scanner;

public class LIKEOPERATOR {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/pratice";
        String username = "root";
        String password = "abc123";
        Scanner s=new Scanner(System.in) ;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,username,password);
        
        System.out.println("Enter the name");
String name=s.nextLine();
             ResultSet rs=null;
 String sql = "SELECT * FROM pratice.pra WHERE name  like  '" + name + "%'";
	PreparedStatement stmt=con.prepareStatement(sql);
rs=stmt.executeQuery();
while(rs.next()){
	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
}
        		
        		
    }
}
