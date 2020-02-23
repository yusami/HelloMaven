package foo.db;

import java.sql.*;

/**
 * Hello world!
 *
 * TODO Add test for INSERT and UPDATE.
 *
 * Caveats:
 *   GRANT SELECT ON mysql.* TO 'test'@'localhost' IDENTIFIED BY 'test';
 */
public class DbWrapper
{
    /**
     * Do simple query.
     */
    public void doQuery() {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            // Connect to MySQL.
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?autoReconnect=true&useSSL=false", "test", "test");
            System.out.println("Connected successfully.");

            stm = con.createStatement();
            String sql = "select * from user";
            rs = stm.executeQuery(sql);

            while(rs.next()){
                String user = rs.getString("User");
                String host = rs.getString("Host");
                System.out.println("-Result::" + user + ":" + host);
            }
        } catch (SQLException ex) {
            System.out.println("Connection error.");
            ex.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("Failed to disconnect.");
                    ex.printStackTrace();
                }
            }
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    System.out.println("Failed to disconnect.");
                    ex.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                    System.out.println("Disconnected successfully.");
                } catch (SQLException ex) {
                    System.out.println("Failed to disconnect.");
                    ex.printStackTrace();
                }
            }
        }
    }
}
