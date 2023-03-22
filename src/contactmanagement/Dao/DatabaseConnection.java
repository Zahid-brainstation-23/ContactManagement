package contactmanagement.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private DatabaseConnection() {
    }
    ;
    Connection connection;

    Connection getConnection() {
        try {
            if (connection == null) {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/phonebook", "root", "");
            }
            return connection;

        } catch (Exception e) {
            return null;
        }
    }
}

