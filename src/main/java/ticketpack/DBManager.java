package ticketpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

    private  static  Connection connection;
    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/traindatabase",
                    "root","9845003308rR@");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

}
