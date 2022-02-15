package reponshitory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRipository {
    private String jdbcURL = "jdbc:mysql://127.0.0.1:3306/ss12";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Trong8668";
    private Connection connection;

    public BaseRipository(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(jdbcURL, jdbcUsername,jdbcPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection(){
        return connection;
    }
}
