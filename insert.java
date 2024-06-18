import java.sql.*;

class insert{
public static void main(String[] args){
try{
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/first_db","root","ram123");
Statement stmt=con.createStatement();
stmt.executeUpdate("insert into myemp values(1,'Swamy',100,'A'),(2,'Sudha',800,'A')");
System.out.println("data inserted");
ResultSet rs=stmt.executeQuery("SELECT * FROM myemp");

while(rs.next()){
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getString(4));
}
}
catch(Exception ex){
System.out.println(" failed to execute");}
}}