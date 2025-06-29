package testing;

import static org.junit.Assert.*;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import setter.Contact;
import setter.ContactService;


public class ContactServiceTest {
    
    private ContactService contactService;
    
    @Before
    public void setUp() {
        contactService = new ContactService();
    }
    
    @Test
    public void testaddingacontact() {// testing add an an contact
        Contact contact = new Contact("8888", "jon", "abramavage","7278012727","727 fern st ");
        Assert.assertTrue(ContactService.addcontact(contact));
    }
    
    @Test
    public void testremovecontact() {// removing an contact
    	Contact contact = new Contact("8888", "jon", "abramavage","7278012727","727 fern st ");
        ContactService.addcontact(contact);
        Assert.assertTrue(contactService.removecontact("8888", "jon", "abramavage","7278012727","727 fern st "));
    }
    
    
    @Test
    public void testgetcontacts() {//getting an contact
    	Contact contact = new Contact("8888", "jon", "abramavage","7278012727","727 fern st ");
    	Contact contact1 = new Contact("81888", "jon", "abramavage","7278012727","727 fern st ");
        ContactService.addcontact(contact);
        ContactService.addcontact(contact1);
        assertEquals(2, contactService.getcontactss("8888", "jon", "abramavage","7278012727","727 fern st ").size());
    }
    
}
