import java.sql.*;

class callableprocedure{
public static void main(String[] args){
try{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first_db","root","ram123");
CallableStatement cstmt=con.prepareCall("{ call emp_name(?,?) }");
cstmt.setInt(1,5);
cstmt.registerOutParameter(2,java.sql.Types.VARCHAR);
System.out.println("Executing stored procedure....");
cstmt.execute();
String empName=cstmt.getString(2);
System.out.println("Emp Namewith ID:5 is " +empName);
}
catch(Exception ex)
{
System.out.println("failed to execute");
}
}
}







