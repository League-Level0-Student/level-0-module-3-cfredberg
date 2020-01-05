
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String brothersBirthday = "January 11th";
		String dadsBirthday = "June 9th";
		String myBirthday = "February 17th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday = JOptionPane.showInputDialog("Who's birthday would you like to see?");
		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom"
		if (birthday.equalsIgnoreCase("bro")) {
			System.out.println(brothersBirthday);
		}
			//print mom's birthday
		// 5. if user asked for "dad"
		else if (birthday.equalsIgnoreCase("dad")) {
			System.out.println(dadsBirthday);
		}
			// print dad's birthday
		// 6. if user asked for your name
		else if (birthday.equalsIgnoreCase("cha")) {
			System.out.println(myBirthday);
		}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			System.out.println("Sorry, i don't remember that person's birthday!");
		}
	} 
}
