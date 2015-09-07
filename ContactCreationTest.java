package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

import static com.example.fw.ContactHelper. CREATION;

public class ContactCreationTest extends TestBase {
	
		
  @Test(dataProvider = "randomValidContactGenerator")
  public void testContactCreationWithValidData(GroupContact contact) throws Exception {    
    
		List<GroupContact> oldList = app.getContactHelper().getContacts();
		
		app.getContactHelper().createContact(contact);
		
        List<GroupContact> newList = app.getContactHelper().getContacts();
        
        //assertEquals(newList.size(), oldList.size()+1);
        
        oldList.add(contact);
        Collections.sort(oldList);
        assertEquals(newList, oldList);
        
      }
}
