import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber=myNumber;
        this.myContacts =new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName())>=0){
            System.out.println("name already exists");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public int findContact(String contactName){
        for(int i =0;i<myContacts.size();i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName() == contactName){
                return i;
            }
        }
        return -1;

    }

}