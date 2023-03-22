package contactmanagement.Dao;

import contactmanagement.Entities.Contact;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContactDao {

    private Connection connection;

    public ContactDao() {
        connection = DatabaseConnection.getConnection();
     
    }

    public List<Contact> getContacts() throws SQLException {

        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select * from contact");
        List<Contact> contacts = new ArrayList<Contact>();
        while (rs.next()) {
            contacts.add(new Contact(rs.getString("number"),rs.getString("name")));
        }
        return contacts;
    }

}
