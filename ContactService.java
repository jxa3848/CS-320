//jonathan abramavage redone5/27/2028  

package setter;

import java.util.ArrayList;

import java.util.List;

public class ContactService {
    private static List<Contact> contacts; // adds an array list 
    
    public ContactService() {
        contacts = new ArrayList<>(); //makes a new array list
    }
    
    public static boolean addcontact(Contact contact) {
        if (contact == null) {// makes the process to add an contact
            throw new IllegalArgumentException("appointment can't be null");
        }
        
        for (Contact existingcontact : contacts) {
            if (existingcontact.gettheID().equals(contact.gettheID())) {
                throw new IllegalArgumentException("the ID can't be the same ");// makes it so every id has to be diffrent
            }
        }
        
        return contacts.add(contact);
    }
    
    public boolean removecontact(String contactID,String Fname, String Lname,String Phone, String Address) {
        if (contactID == null) {
            throw new IllegalArgumentException("ID can't be null"); //makes it so the id cant be null
        }
        
        for (Contact contact : contacts) {
            if (contact.gettheID().equals(contactID)) { // makes the process to remove an contact
                contacts.remove(contact);
                return true;
            }
        }
        
        throw new IllegalArgumentException("no appointment found");
    }
    
    public List<Contact> getcontactss(String ID,String Fname, String Lname,String Phone, String Address) { //sets the getting the contact 
        return contacts;
    }


	
}