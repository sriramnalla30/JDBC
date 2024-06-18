import java.sql.*;

class AutomaticityCommit {
    public static void main(String[] args) {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_db", "root", "ram123");
            con.setAutoCommit(false); // Start transaction

            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO myemp VALUES (5, 'Bob', 400, 'B')");
            stmt.executeUpdate("INSERT INTO myemp VALUES (6, 'Carol', 450, 'C')");

            con.commit(); // Commit transaction
            System.out.println("Transaction committed");

            ResultSet rs = stmt.executeQuery("SELECT * FROM myemp");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3) + "  " + rs.getString(4));
            }
        } catch (Exception ex) {
            try {
                if (con != null) {
                    con.rollback(); // Rollback transaction
                    System.out.println("Transaction rolled back");
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
            ex.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.setAutoCommit(true); // Reset auto-commit
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
