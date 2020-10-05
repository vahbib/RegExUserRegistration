package com.day9.regex.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	static Scanner sc = new Scanner(System.in);

	// UC1 - First name starts with Cap and has minimum 3 characters
	public static void firstName() {
		System.out.println("Enter First Name");
		String fN = sc.nextLine();
		if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", fN) == true)
			System.out.println("Valid First Name");
		else
			System.out.println("Invalid First Name");
	}

	// UC2 - Last name starts with Cap and has minimum 3 characters
	public static void lastName() {
		System.out.println("\nEnter Last Name");
		String lN = sc.nextLine();
		if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lN) == true)
			System.out.println("Valid Last Name");
		else
			System.out.println("Invalid Last Name");
	}

	/* UC 3 - enter a valid email
	 * UC 9 - Cleared All Sample Provided 
	 */
	public static void email() {
		System.out.println("\nEnter EMail");
		String email = sc.nextLine();
		if (Pattern.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*$", email) == true)
			System.out.println("Valid Email");
		else
			System.out.println("Invalid Email");
	}

	// UC4 - Mobile Format
	public static void mobile() {
		System.out.println("\nEnter Mobile Number With Country Code(space between code and number)");
		String m = sc.nextLine();
		if (Pattern.matches("^[1-9]{2}\s{1}[1-9]{1}[0-9]{9}$", m) == true)
			System.out.println("Valid Mobile");
		else
			System.out.println("Invalid Mobile");
	}

	// UC 5 to 8 - Password
	public static void password() {
		System.out.println("\nEnter the Password");
		String p = sc.nextLine();
		if (Pattern.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s)[a-zA-Z0-9]*[^a-zA-Z0-9\\s]{1}[a-zA-Z0-9]*$", p) == true)
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
	}

	public static void main(String[] args) {
		System.out.println("यूजर रजिस्ट्रेशन प्रोग्राम में आपका स्वागत है|");
		firstName();
		lastName();
		email();
		mobile();
		password();
	}
}
