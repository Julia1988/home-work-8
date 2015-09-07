package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class ContactRemovalTests extends TestBase {
	
	@Test
	public void deleteSomeContact () {
		
		List<GroupContact> oldList = app.getContactHelper().getContacts();
		
		Random rnd = new Random ();
		int index = rnd.nextInt(oldList.size() - 1);
		
	    app.getContactHelper().deleteContact(index);
	 
	    
	    List<GroupContact> newList = app.getContactHelper(). getContacts();
	    
	    oldList.remove(index);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	    
	   
	    
	 }
	

}
