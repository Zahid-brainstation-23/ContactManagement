package contactmanagement.Controller;

import contactmanagement.Dao.ContactDao;
import contactmanagement.Entities.Contact;
import contactmanagement.service.ContactService;
import java.sql.SQLException;
import java.util.List;

public class ContactController implements ContactService {

    private ContactDao contactDao;

    public ContactController() throws SQLException {
        contactDao = new ContactDao();
    }

    @Override
    public void saveContact(Contact contact) {
        try {
            contactDao.saveContact(contact);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void deleteContact(Contact contact) {
        try {
            contactDao.deleteContact(contact);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void deleteContact(String number) {
        try {
            contactDao.deleteContact(number);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public List<Contact> getContactList() {
        try {
            return contactDao.getContacts();
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

}
