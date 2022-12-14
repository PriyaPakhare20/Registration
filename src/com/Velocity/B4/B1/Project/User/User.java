

package com.Velocity.B4.B1.Project.User;

import java.util.Scanner;

public class User {
	

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
System.out.println("Sign Up>>");

System.out.print("Enter your name: ");


String name = input.nextLine();
System.out.println("My name is " + name);


System.out.println("Enter your MobileNo.");
long MobileNo = input.nextLong();
System.out.println("Mobile NO. is" +MobileNo);



input.close();
}
}
