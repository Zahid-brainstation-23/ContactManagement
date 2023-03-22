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
    private Statement statement;

    public ContactDao() throws SQLException {
        connection = DatabaseConnection.getConnection();
        statement = connection.createStatement();
    }

    public List<Contact> getContacts() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from contact");
        List<Contact> contacts = new ArrayList<Contact>();
        while (rs.next()) {
            contacts.add(new Contact(rs.getString("number"), rs.getString("name")));
        }
        return contacts;
    }

    public void saveContact(Contact contact) throws SQLException {
        String sql = "INSERT INTO contact('number','name') VALUES ('" + contact.getNumber() + "', '" + contact.getName() + "')";
        statement.executeUpdate(sql);
    }

    public void deleteContact(String number) throws SQLException {
        String sql = "delete from contact where number='" + number + "';";
        statement.executeUpdate(sql);
    }

    public void deleteContact(Contact contact) throws SQLException {
        String sql = "delete from contact where number='" + contact.getNumber() + "' and name='" + contact.getName() + "';";
        statement.executeUpdate(sql);
    }
}
