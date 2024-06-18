import java.sql.*;

class parameterized{
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_db", "root", "ram123");
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO myemp VALUES (?, ?, ?, ?)");
            
            pstmt.setInt(1, 3);
            pstmt.setString(2, "Alice");
            pstmt.setInt(3, 300);
            pstmt.setString(4, "A");
            pstmt.executeUpdate();

            System.out.println("Record inserted using PreparedStatement");

            ResultSet rs = pstmt.executeQuery("SELECT * FROM myemp");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3) + "  " + rs.getString(4));
            }
        } catch (Exception ex) {
            System.out.println("Insertion failed");
            ex.printStackTrace();
        }
    }
}
