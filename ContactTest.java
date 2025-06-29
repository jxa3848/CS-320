/*jonathan abramavage  this is good to go 
 * 5/30/2025
 */
package testing;

import org.junit.*;
import org.junit.jupiter.api.Assertions;

import setter.Contact;

public class ContactTest {
    @Test
    public void createnewcontact() {
    	Contact task = new Contact("8888", "jon", "abramavage","7278070101","727 fern st");
        Assert.assertEquals("8888", task.gettheID());
        Assert.assertEquals("jon", task.gettheFName());
        Assert.assertEquals("abramavage", task.gettheLName());
        Assert.assertEquals("7278070101", task.getthePhone());
        Assert.assertEquals("727 fern st", task.gettheAddress());
    }
    
    @Test
    public void testIDTolong() {// testing that the id is over the 10 characters
        Assertions.assertThrows(IllegalArgumentException.class,() ->{
            new Contact ("888888888888", "jon ", "abramavage ", "7198070101", "727 fern st");
        });	}

    @Test
    public void testTaskClassIDisNull() {// testing the id to make sure it is not null
        Assertions.assertThrows(IllegalArgumentException.class,() ->{
            new Contact (null, "jon ", "abramavage ", "7198070101", "727 fern st");
        });	}
    @Test
    public void testfirstNameTolong() {
        Assertions.assertThrows(IllegalArgumentException.class,() ->{// testing that the name is over the 10 characters
            new Contact ("8888", "jon123456789jon ", "abramavage ", "7198070101", "727 fern st");
        });	}

    @Test
    public void testfirstNameisNull() {// testing the name to make sure it is not null
        Assertions.assertThrows(IllegalArgumentException.class,() ->{
            new Contact ("8888", null, "abramavage ", "7198070101", "727 fern st");
        });	}
    @Test
    public void testLastnameTolong() {
        Assertions.assertThrows(IllegalArgumentException.class,() ->{// testing that the lastname is over the 10 characters
            new Contact ("8888", "jon ", "abramavageabramavage ", "7198070101", "727 fern st");
        });	}

    @Test
    public void testLastnameisNull() {// testing the  lastname to make sure it is not null
        Assertions.assertThrows(IllegalArgumentException.class,() ->{
            new Contact ("8888", "jon ", null,  "7198070101", "727 fern st");
        
        });	}
    @Test
    public void testphoneTolong() {
        Assertions.assertThrows(IllegalArgumentException.class,() ->{// testing that the phone is over the 0 characters
            new Contact ("8888", "jon ", "abramavage ", "7198070101727", "727 fern st");
        });	}

    @Test
    public void testphoneisNull() {// testing the phone to make sure it is not null
        Assertions.assertThrows(IllegalArgumentException.class,() ->{
            new Contact ("8888", "jon", "abramavage ", null, "727 fern st");
        });	}
    @Test
    public void testphoneisnotnumbers() {// testing the phone to make sure it is only numbers
        Assertions.assertThrows(IllegalArgumentException.class,() ->{
            new Contact ("8888", "jon", "abramavage ", "7278o17272", "727 fern st");
        });	}
    @Test
    public void testaddressTolong() {
        Assertions.assertThrows(IllegalArgumentException.class,() ->{// testing that the address is over the 30 characters
            new Contact ("8888", "jon ", "abramavagea ", "7198070101", "727 fern st123456789123456789 727 fern st");
        });	}

    @Test
    public void testadressisNull() {// testing the address to make sure it is not null
        Assertions.assertThrows(IllegalArgumentException.class,() ->{
            new Contact ("8888", "jon ", "abramavage",  "7198070101", null);
        
        });	}
}
