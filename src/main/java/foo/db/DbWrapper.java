package foo.db;

import java.sql.*;

/**
 * Hello world!
 *
 * Caveats:
 *  mysql> GRANT SELECT ON mysql.* TO 'test'@'localhost' IDENTIFIED BY 'test';
 */
public class DbWrapper
{
    /**
     * Do simple query.
     */
    public void doQuery() {
        Connection con = null;
        try {
            // Connect to MySQL.
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "test", "test");
            System.out.println("Connected successfully.");

            Statement stm = con.createStatement();
            String sql = "select * from user";
            ResultSet rs = stm.executeQuery(sql);

            while(rs.next()){
                String user = rs.getString("User");
                String host = rs.getString("Host");
                System.out.println("-Result::" + user + ":" + host);
            }
        } catch (SQLException e) {
            System.out.println("Connection error.");
			      throw new RuntimeException(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                    System.out.println("Disconnected successfully.");
                } catch (SQLException e) {
                    System.out.println("Failed to disconnect.");
                }
            }
        }
    }
}
