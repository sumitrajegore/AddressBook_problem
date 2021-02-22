package Addresbook;
import java.util.Scanner;
public class AddressBookMain {

	public String[] Person() {
		Scanner input = new Scanner(System.in);
		String[] contact = new String[8];
		System.out.println("Enter your First Name");
		String first_name = input.next();
		contact[0] = first_name;
		System.out.println("Enter your Last Name");
		String last_name = input.next();
		contact[1] = last_name;
		System.out.println("Enter your House number");
		String house_no = input.next();
		contact[2] = house_no;
		System.out.println("Enter your City name");
		String city = input.next();
		contact[3] = city;
		System.out.println("Enter your State name");
		String state = input.next();
		contact[4] = state;
		System.out.println("Enter your Pin Code");
		String pin_code = input.next();
		contact[5] = pin_code;
		System.out.println("Enter your Phone number");
		String phone_number = input.next();
		contact[6] = phone_number;
		System.out.println("Enter your e-mail address");
		String email = input.next();
		contact[7] = email;
		return contact;
		
	}
 
	public void edit(String[] contact) {
		
		for (int j = 0; j < contact.length; j++) {
			
			System.out.println(contact[j]);
		}
		
		System.out.println("If you want to edit contact then press 1");
		Scanner sc = new Scanner(System.in);
		int read = sc.nextInt();
		if (read == 1) {
			
				System.out.println("Enter your new First Name");
				String newFirstName = sc.next();
				contact[0] = newFirstName;
				
				System.out.println("Enter your new Last Name");
				String newLastName = sc.next();
				contact[1] = newLastName;
				
				System.out.println("Enter your new House Number");
				String newHouseNumber = sc.next();
				contact[2] = newHouseNumber;
				
				System.out.println("Enter your new City");
				String newCity = sc.next();
				contact[3] = newCity;
				
				System.out.println("Enter your new State");
				String newState = sc.next();
				contact[4] = newState;
				
				System.out.println("Enter your new Pin Code");
				String newPinCode = sc.next();
				contact[5] = newPinCode;
				
				System.out.println("Enter your new Phone number");
				String newPhoneNumber = sc.next();
				contact[6] = newPhoneNumber;
				
				System.out.println("Enter your new email");
				String newEmail = sc.next();
				contact[7] = newEmail;
				
				System.out.println("Your new details are as follows");
		      	for (int j = 0; j < contact.length; j++) {
		      		
				     System.out.println(contact[j]);
			    }		
		}
		else 
		 {
				System.out.println("Invalid Input");
		}	 
	}	
	public static void main(String[] args) {
		
		System.out.println("WELCOME to Address Book Program");
		AddressBookMain contact = new AddressBookMain();
		String[] info = contact.Person();
		contact.edit(info);
	}
}