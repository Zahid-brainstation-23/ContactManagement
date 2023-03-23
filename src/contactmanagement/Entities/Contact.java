
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact{" + "name=" + name + ", number=" + number + '}';
    }
    
}
