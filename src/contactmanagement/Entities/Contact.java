
package contactmanagement.Entities;

public class Contact {
    private String name;
    private String number;
    
    public Contact(String number,String name){
        this.number = number;
        this.name = name;
    }
    public void call(){
        System.out.println("calloing");
    }
    public void sendMassage(String message){
        System.out.println("Message Sent");
    }

    @Override
    public String toString() {
        return "Contact{" + "name=" + name + ", number=" + number + '}';
    }
    
}
