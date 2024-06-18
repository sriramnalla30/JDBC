import java.sql.*;

class update_record{
public static void main(String[] args){
try{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first_db","root","ram123");
Statement stmt=con.createStatement();

stmt.executeUpdate("Update myemp SET egrade='b' WHERE e_num=2");

System.out.println("salary updated");

ResultSet rs=stmt.executeQuery("SELECT * from myemp");

while(rs.next()){
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getString(4));
}
}
catch(Exception ex){
System.out.println("not updated");}
}
}