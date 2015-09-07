package com.example.tests;

import static com.example.fw.ContactHelper. MODIFICATION;

import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {
	

	@Test(dataProvider = "randomValidContactGenerator") 
	public void modifySomeContact (GroupContact contact) {
		
		List<GroupContact> oldList = app.getContactHelper().getContacts();
		
		Random rnd = new Random ();
		int index = rnd.nextInt(oldList.size() - 1);
		
		app.getContactHelper().modifyContact(index, contact);
		
        List<GroupContact> newList = app.getContactHelper(). getContacts();
        
	    
	   oldList.remove(index);
	   oldList.add(contact);
	   //Collections.sort(oldList);
	   //assertEquals(newList, oldList);
 
	}


}
