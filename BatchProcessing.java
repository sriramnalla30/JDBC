import java.sql.*;

class BatchProcessing{
public static void main(String[] args){
try{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first_db","root","ram123");
Statement stmt=con.createStatement();
con.setAutoCommit(false);
stmt.addBatch("INSERT into myemp values(3,'gayathri',400,'b')");
stmt.addBatch("INSERT into myemp values(4,'sriram',500,'b')");
stmt.executeBatch();

System.out.println("the table is updated");
ResultSet rs=stmt.executeQuery("SELECT * from myemp");

while(rs.next()){
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getString(4));
}
con.commit();
con.close();
}
catch(Exception ex){
System.out.println("table not yet updated");}
}}

