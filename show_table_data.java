import java.sql.*;

class show_table_data{
public static void main(String[] args){
try{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first_db","root","ram123");
Statement stmt=con.createStatement();
ResultSet rs= stmt.executeQuery("Select * from myemp");

while(rs.next()){
 System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getString(4));
}
}
catch(Exception ex){
System.out.println("not updated");}
}
}