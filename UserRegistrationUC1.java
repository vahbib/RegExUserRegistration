package com.day9.regex.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationUC1 {
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
	public static void main(String[] args) {
		firstName();
	}

}
