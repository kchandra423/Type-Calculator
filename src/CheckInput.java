/*
 Author: Nathaniel Thomas
 Date: 10/27/19
 Rev: 01
 */

import java.util.*;


public class CheckInput {
	Scanner myobj;
	public CheckInput() {
		myobj = new Scanner(System.in);
	}
	
	public int getInt(String message) { //Method that checks to make sure that the input is an integer
		int output = 0;
		boolean check = false;
		System.out.println(message);
		while (!check) { //Checks to make sure that the input is and integer and won't continue unless it is
			if (myobj.hasNextInt()) {
				output = myobj.nextInt();
				check = true;
			}
			else {
				System.out.println("That wasn't a valid input");
				System.out.println(message);
				myobj.nextLine();
			}
		}
		return output;
	}
	
	public int checkIntRange(String message, int lowPar, int highPar) { //Method that checks to make sure that the input is an integer in a certain range
		int output = 0;
		boolean check = false;
		System.out.println(message);
		while (!check) { //Checks to make sure that the input is in a certain range and won't continue unless it is
			if (myobj.hasNextInt()) {
				output = myobj.nextInt();
				if (output >= lowPar && output <= highPar) {
					check = true;
				}
				else {
					System.out.println("That wasn't a valid input");
					System.out.println(message);
					myobj.nextLine();
				}
			}
			else {
				System.out.println("That wasn't a valid input");
				System.out.println(message);
				myobj.nextLine();
			}
		}
		return output;
	}
	
	public int getPosInt(String message) { //Method that checks to make sure that the input is a positive integer
		int output = 0;
		boolean check = false;
		System.out.println(message);
		while (!check) { //Checks to make sure that the input is in a certain range and won't continue unless it is
			if (myobj.hasNextInt()) {
				output = myobj.nextInt();
				if (output >= 0) {
					check = true;
				}
				else {
					System.out.println("That wasn't a valid input");
					System.out.println(message);
					myobj.nextLine();
				}
			}
			else {
				System.out.println("That wasn't a valid input");
				System.out.println(message);
				myobj.nextLine();
			}
		}
		return output;
	}
	
	public boolean checkInt(String input) { //Method that checks to make sure that the input is an integer
		try {
			Double.parseDouble(input);
			return true;
		}
		catch (NumberFormatException e) {
			return false;
		}
	}
	
	public String getMessage(String message, String desiredOutput) {
		String output = "";
		String checker;
		String [] parts = desiredOutput.split(" ");
		boolean check = false;
		System.out.println(message);
		while (!check) { //Checks to make sure that the input is a String and won't continue to the rest of the code unless it is
			checker = myobj.next();
			for (String element : parts) { //Checks the user input against all the possible outputs the code wanted
	            if (element.equalsIgnoreCase(checker)) { 
	                check = true; 
	                output = checker;
	                break; 
	            } 
	        }
			if (!check) {
				System.out.println("That wasn't a valid input");
				System.out.println(message);
			}
		}
		return output;
	}
	
	public String getYesNo(String message) {
		String output = "";
		String checker;
		boolean check = false;
		System.out.println(message);
		while (!check) { //Checks to make sure that the input is a String and won't continue to the rest of the code unless it is
			checker = myobj.next();
			if (checker.equals("y") || checker.equals("yes") || checker.equals("Yes") || checker.equals("n") || checker.equals("no") || checker.equals("No")) {
				check = true;
				output = checker;
			}
			else {
				System.out.println("That wasn't a valid input");
				System.out.println(message);
			}
		}
		return output;
	}
	
	public boolean checkMessage(String userInput, String desiredOutputs) {
		boolean output = false;
		String [] parts = desiredOutputs.split(" ");
		for (String element : parts) { //Checks the user input against all the possible outputs the code wanted
            if (element.equals(userInput)) { 
                output = true;
                break; 
            } 
        }
		return output;
	}
	
	public String getString(String message) {
		String output = "";
		String checker = "";
		boolean check = false;
		boolean containsDigit = false;
		System.out.println(message);
		while (!check) { //Checks to make sure that the input is a String and won't continue to the rest of the code unless it is
			checker = myobj.next();
			containsDigit = false;
			for (char c : checker.toCharArray()) {
				if (Character.isDigit(c)) {
					containsDigit = true;
				}
			}
			if (containsDigit) {
				System.out.println("That wasn't a valid input");
				System.out.println(message);
			}
			else {
				check = true;
				output = checker;
			}
		}
		
		return output;
	}
	
	public String next(String message) {
		System.out.println(message);
		String output = myobj.next();
		return output;
	}
}