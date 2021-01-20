package by.main.simplest_classes_and_objects.class07;

import java.util.Scanner;

public class SetInterwalCreditCard {
static Scanner scanner=new Scanner(System.in);
	
	public static int read() {
		while(!scanner.hasNextInt()) {
			scanner.next();
			
		}
		return scanner.nextInt();
		
	}
}
