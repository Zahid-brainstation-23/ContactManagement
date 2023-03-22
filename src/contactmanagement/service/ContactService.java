
package contactmanagement.service;

import contactmanagement.Entities.Contact;
import java.util.List;

public interface ContactService {
    void saveContact(Contact contact);
    void deleteContact(Contact contact);
    void deleteContact(String number);
    List<Contact> getContactList();
}
