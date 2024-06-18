import java.sql.*;

class delete {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_db", "root", "ram123");
            Statement stmt = con.createStatement();
            stmt.execute("DROP TABLE myemp");
            System.out.println("Table myemp dropped");
            
          
        } catch (Exception ex) {
            System.out.println("Table drop failed");
            ex.printStackTrace();
        }
    }
}
