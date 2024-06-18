
import java.sql.*;
class Query01{
public static void main(String[] args){
try{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first_db","root","ram123");
System.out.println("connection established");
}
catch (Exception ex) {
            System.out.println("An error occurred.");
            ex.printStackTrace();
        }}
}
