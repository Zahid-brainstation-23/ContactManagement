package contactmanagement.Controller;

import contactmanagement.Dao.ContactDao;
import contactmanagement.Entities.Contact;
import contactmanagement.service.ContactService;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContactController implements ContactService {

    private ContactDao contactDao;

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
