import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoJdbc {
    static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:postgresql://localhost:5433/java_learn";
        String username = "testuser";
        String password = "testpass";
        String query = "INSERT INTO student VALUES (?, ?, ?)";

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, username, password);

        PreparedStatement sta = con.prepareStatement(query);

        sta.setInt(1, 6);
        sta.setInt(2, 50);
        sta.setString(3, "Patrick");

        boolean status = sta.execute();

        System.out.println(status);
//        System.out.println(result.next());
//
//        String name = result.getString("sname");
//
//        System.out.println("Name of student: " + name);
//
//        con.close();

        System.out.println("Connection Closed");
    }
}

