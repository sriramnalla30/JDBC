import java.sql.*;

class create{
public static void main(String[] args){
try{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first_db","root","ram123");
Statement stmt=con.createStatement();
stmt.execute("create table myemp(e_num int,ename char(20),esalary int,egrade char(20))");
System.out.println("table created with name myemp"); 
}
catch(Exception ex){
System.out.println("table creation failed");}
}
}