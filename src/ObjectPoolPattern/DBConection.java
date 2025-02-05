package ObjectPoolPattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConection {
    Connection mysqlConnection;


        DBConection() {
            try {
                mysqlConnection = DriverManager.getConnection("url", "username", "password");
            } catch (SQLException ex) {
                //
            }
        }
}
