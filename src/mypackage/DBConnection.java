package mypackage;

import java.sql.*;

import static java.lang.Class.forName;

public class DBConnection {

    public String driverName = "com.mysql.cj.jdbc.Driver";
    public String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public String login = "root";
    public String password = "";

    public Statement stat;
    public Connection conn;
    public DBConnection() throws SQLException {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e){
            System.err.println("Not found JDBC driver");
            e.printStackTrace();
        }

        try {
             conn = DriverManager.getConnection(url,login,password);
             stat = conn.createStatement();
        } catch (SQLException e){
            System.err.println("Error with connection");
            e.printStackTrace();
        }
        ResultSet resultSet = stat.executeQuery("SELECT * from user");
        while(resultSet.next()) System.out.println(resultSet.getInt(1)+ " "+resultSet.getString(2)+ " "+resultSet.getString(3)+ " "+resultSet.getInt(4)+ " ");
    }
}
