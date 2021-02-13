package Addresbook;

  class Contact {

        private String firstname;
    	private String lastname;
    	private String address;
    	private String city;
    	private String state;
    	private String gmail;
    	private long phonenumber;
    	private long zip;

    public Contact(String firstname, String lastname, String address,
     String city, String state, String gmail, long phonenumber, long zip) {

	this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.gmail = gmail;
        this.phonenumber = phonenumber;
        this.zip = zip;
    }

    public String getfirstName() {
	return firstname;
        }

    public String getlastName() {
        return lastname;
        }

    public String getAddress() {
        return address;
        }

    public String getCity() {
        return city;
        }

    public String getState() {
        return state;
        }

    public String getGmail() {
        return gmail;
        }

    public long getNumber() {
	return phonenumber;
        }

    public long zip() {
        return zip;
        }

    public void printcontact() {

		System.out.println("Name: " + firstname+" "+ lastname);
		System.out.println("Phone: " + phonenumber);
		System.out.println("Address: "+ address);
		System.out.println("City: "+ city);
		System.out.println("Gmail: "+ gmail);
		System.out.println("State: "+ state);
		System.out.println("Zip code: "+ zip);
		System.out.println("  ");
		}
}
public class AddressBook {

    public static void main(String[] args) {

    	System.out.println("Welcome to the AddressBook program");
    	System.out.println("\nwe are Adding a contact to our address book.\n");
    	Contact cont = new Contact( "Sumit", "Rajegore", "Pimpari", "Pune", 
	      "sumitrajegore@gmail.com", "Maharashtra", 9822654119L, 431605);
	cont.printcontact();
	System.out.println("\n one contact is successfully created");
        }
}
