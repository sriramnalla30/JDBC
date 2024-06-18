import java.sql.*;

class metadata{
public static void main(String[] args){
try{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first_db","root","ram123");
DatabaseMetaData dbmd = con.getMetaData();
System.out.println("Driver Name :"+dbmd.getDriverName());
System.out.println("Driver Version :"+dbmd.getDriverVersion());
System.out.println("Driver UserName :"+dbmd.getUserName());
System.out.println("Driver DataBase Product Name :"+dbmd.getDatabaseProductName());
System.out.println("Driver Database Product Version:"+dbmd.getDatabaseProductVersion());
con.close();
}catch(Exception ex){
System.out.println("cant display");
}}}