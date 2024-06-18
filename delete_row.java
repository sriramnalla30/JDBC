import java.sql.*;

class delete_row{
public static void main(String[] args){
try{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first_db","root","ram123");
Statement stmt=con.createStatement();

stmt.executeUpdate("DELETE from myemp WHERE e_num=3 or e_num=5");

System.out.println("deleted your row and remaing in the table are given below");

ResultSet rs=stmt.executeQuery("SELECT * from myemp");

while(rs.next()){
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getString(4));
}
}
catch(Exception ex){
System.out.println("not deleted");}
}
}