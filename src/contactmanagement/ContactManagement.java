
package contactmanagement;

import contactmanagement.Dao.ContactDao;
import java.sql.SQLException;


public class ContactManagement {

    public static void main(String[] args) throws SQLException {
      ContactDao ob = new ContactDao();
        System.out.println(ob.getContacts());
    }
    
}
