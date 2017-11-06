import java.io.*;
import javax.swing.DefaultListModel;
import java.util.*;
/**
 * @author Nnamdi Okwechime
 *
 */
public class AddressBook {

	private DefaultListModel<BuddyInfo> contacts;
	

	public AddressBook(){
		contacts = new DefaultListModel<>();
	}
	
	public DefaultListModel<BuddyInfo> getList(){
		return contacts;
	}
	
	public void addBuddy(BuddyInfo contact) {
		contacts.addElement(contact);
				
	}
	
	
	public void removeBuddy(String key) {
		for(int i = 0; i<contacts.size();i++) {
			if (key.equals(contacts.getElementAt(i).getName())) {
				contacts.remove(i);
			}
		}
		
	}
	
	public String toString() {
		String printout = "";
		for(int i = 0;i<contacts.size();i++) {
			printout = printout + contacts.get(i).toString();
		}
		
		return printout;
	}
	
	public void save2File() throws IOException {
		String savetext = toString();
		BufferedWriter out = new BufferedWriter(new FileWriter("mytestingFile.txt"));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Address Book");
		BuddyInfo test = new BuddyInfo("Diddy", "pimp House", "I'll call you"); 
		BuddyInfo testted = new BuddyInfo("reaper", "Somewhere in America", "3435409483"); 
/*		test.setName("Diddy");
		testted.setName("Reaper");
		testted.setAddress("Somewhere in America");
		testted.setPhoneNumber("343540");*/
		AddressBook contactlist = new AddressBook(); 
		contactlist.addBuddy(test);
		contactlist.removeBuddy(test.getName());
		contactlist.addBuddy(test);
		contactlist.addBuddy(testted);
		contactlist.toString();

	}
	
	
	
	

}
