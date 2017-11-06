/**
 * 
 */

/**
 * @author Nnamdi Okwechime
 *
 */
public class BuddyInfo {

	private static String name; 
	private static String address; 
	private static String phoneNumber; 
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World!");
		BuddyInfo bro = new BuddyInfo("Reaper", "Somewhere in America", "3435409483");
		/*bro.setName("Reaper");
		bro.setAddress("Somewhere in America");
		bro.setPhoneNumber("34354094");*/
		
		System.out.println("Hello " + bro.getName());

	}
	
	public BuddyInfo(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address; 
		this.phoneNumber = phoneNumber;
	}
	
	
	/**
	 * @return the name
	 */
	public static String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public static void setName(String name) {
		BuddyInfo.name = name;
	}

	/**
	 * @return the address
	 */
	public static String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public static void setAddress(String address) {
		BuddyInfo.address = address;
	}

	/**
	 * @return the phoneNumber
	 */
	public static String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public static void setPhoneNumber(String phoneNumber) {
		BuddyInfo.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return name + "  " + phoneNumber + " \n" + address+  "\n";
	}
}
