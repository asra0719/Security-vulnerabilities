import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Prevention {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/security_lab";
        String user = "root"; // Default MySQL user
        String password = ""; // Default MySQL password, usually empty for XAMPP

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter username to retrieve: ");
            String username = scanner.nextLine();
            // prevention of sql injection
            String query = "SELECT * FROM User WHERE username = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Username: "
                        + rs.getString("username") + ", Password: " + rs.getString("password"));
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}