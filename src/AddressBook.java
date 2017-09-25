import java.util.*;
/**
 * @author Nnamdi Okwechime
 *
 */
public class AddressBook {

	Map<String,BuddyInfo> contacts;
	

	public AddressBook(){
		contacts = new HashMap<String,BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo contact) {
		contacts.put(contact.getName(), contact);
				
	}
	
	public void removeBuddy(String key) {
		contacts.remove(key);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Address Book");
		BuddyInfo test = new BuddyInfo(); 
		test.setName("Diddy");
		AddressBook contactlist = new AddressBook(); 
		contactlist.addBuddy(test);
		contactlist.removeBuddy(test.getName());

	}
	
	
	
	

}
