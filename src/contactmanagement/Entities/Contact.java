
package contactmanagement.Entities;

public class Contact {
    private String name;
    private String number;
    
    void call(){
        System.out.println("calloing");
    }
    void sendMassage(String message){
        System.out.println("Message Sent");
    }
    
}
