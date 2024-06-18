import java.sql.*;

class show_tables{
public static void main(String[] args){
try {
  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_db", "root", "ram123");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SHOW TABLES");
           boolean hasTables = false;
            while (rs.next()) {
                if (!hasTables) {
                    hasTables = true;
                }
                System.out.println("Your table name is " + rs.getString(1));
            }
            
            if (!hasTables) {
                System.out.println("No tables created yet");
            
}
}
catch(Exception ex){
System.out.println("no tables created yet ");
}}}