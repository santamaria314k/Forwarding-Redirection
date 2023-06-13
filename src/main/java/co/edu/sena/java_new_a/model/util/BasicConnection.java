package co.edu.sena.java_new_a.model.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BasicConnection {
        public static  void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/myappk?serverTimezone=America/Bogota";

            String username = "root";
            String password = "";
            String sql = null;
            Connection conn = null;
            java.sql.Statement stm = null;
            java.sql.ResultSet rs = null;
            try {
                sql = "SELECT * FROM myappk.users_tbl";
                conn = DriverManager.getConnection(url, username, password);


                 stm = conn.createStatement();
                 rs = stm.executeQuery(sql);
                while (rs.next()) {

                    System.out.print(rs.getString("user_firstname"));
                    System.out.print(" | ");

                    System.out.println(rs.getString("user_lastname"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    rs.close();
                    stm.close();
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }// end try-catch
        } // main


} // BasicConnection






