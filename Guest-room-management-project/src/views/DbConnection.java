package views;

import java.sql.*;
public class DbConnection {
    public String dburl = "jdbc:mysql://localhost:3306/bauet_guestroom";
    public String dbuser = "root";
    public String dbuserpass = "";
    Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //here bauet_guestroom is database name, root is username and password
            try ( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bauet_guestroom", "root", "")) {
                //here bauet_guestroom is database name, root is username and password
                //System.out.println("Database connected successfuly.");
                //Statement stmt = con.createStatement();
                // for update or insert data
                //stmt.executeUpdate("INSERT INTO `admin` (`username`, `password`) VALUES ('Ruhul Ameen', 'yeo yeo')");
                // for serch or fetch data
                //ResultSet rs = stmt.executeQuery("select * from admin");
//                while (rs.next()) {
//                    System.out.println(rs.getString(1) + "  " + rs.getString(2));
//                }
                return con;
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    
}
