package com.practica4Aalgoritmos.app;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		//Constants
		
		//Variable
		byte age = 0;
		String name = "";
		String message = "";
		
		//Objects
		Scanner kInput = new Scanner(System.in);
		
		//Inputs
		System.out.println("Input your age:");
		age = kInput.nextByte();
		System.out.println("Input your name:");
		name = kInput.next();
		
		//Process
		if (age < 18) {
			message = "Hey " + name + " you are a kid!!!";
		} else if (age >= 18 && age < 38) {
			message = "Hey " + name + " you are a chavoruco!!";
		} else if (age == 38) {
			message = "Hey " + name + " you are Daddy!!!";
		} else if (age > 38) {
			message = "Hey " + name + " you are a viejito!!";
		}
		
		//Outputs
		System.out.println(message);
		
		//Termination
		kInput.close();
	}

}
