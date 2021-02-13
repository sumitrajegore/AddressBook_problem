package Addresbook;
import java.io.*;
import java.util.Scanner;

class Contact {

        private String firstname;
    	private String lastname;
    	private String address;
    	private String city;
    	private String state;
    	private String gmail;
    	private long phonenumber;
    	private long zip;

    public Contact(String firstname, String lastname, String address, String city, String state, String gmail, long phonenumber, long zip) {

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

    public static void main(String[] args) throws IOException {

    	System.out.println("Welcome to the AddressBook program");
    	System.out.println("\nwe are Adding a contact to our address book.\n");
    	Contact cont = new Contact( "Sumit", "Rajegore", "Pimpari", "Pune", "sumitrajegore@gmail.com", "Maharashtra", 9822654119L, 431605);
	cont.printcontact();
	System.out.println("\n one contact is successfully created");
        System.out.println("\nwe are Adding one more contact to our address book.\n");
    	Scanner stdin = new Scanner(System.in);
    	               	System.out.print("Enter First name: ");
		    	String firstname = stdin.next();
        		System.out.print("Enter Last name: ");
	    		String lastname = stdin.next();
	    		stdin.nextLine();
		    	System.out.print("Enter Address: ");
		    	String address = stdin.nextLine();
		    	System.out.print("Enter City name: ");
		    	String city = stdin.next();
		    	System.out.print("Enter gmail id : ");
		    	String gmail = stdin.next();
		    	System.out.print("Enter State name: ");
		    	String state = stdin.next();
		    	System.out.print("Enter Phone number: ");
		    	long phonenumber = stdin.nextLong();
			System.out.print("Enter Zip Code: ");
	    		long zip = stdin.nextLong();
Contact cont1 = new Contact(firstname, lastname, address, city, state, gmail, phonenumber, zip);
	    		cont1.printcontact();
                        System.out.println("\nhere we Added one more contact to our address book.\n");
                        }
}
