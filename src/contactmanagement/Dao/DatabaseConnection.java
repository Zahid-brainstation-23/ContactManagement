package contactmanagement.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private DatabaseConnection() {
    }
    ;
   private static Connection connection;

    public static Connection getConnection() {
        try {
            if (connection == null) {

                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/phonebook", "root", "");
                System.out.println(connection);
            }

            return connection;

        } catch (Exception e) {

            return null;
        }
    }
}
