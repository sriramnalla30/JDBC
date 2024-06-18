import java.sql.*;

class metadataExample{
public static void main(String[] args){
try{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first_db","root","ram123");
DatabaseMetaData dbmd=con.getMetaData();
String table[]={"TABLE"};
ResultSet rs=dbmd.getTables(null,null,null,table);
while(rs.next()){
System.out.println(rs.getString(3));
;}}
catch(Exception ex){
System.out.println("failed");
}}}