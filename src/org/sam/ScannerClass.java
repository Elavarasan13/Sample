package org.sam;

import java.util.Scanner;

public class ScannerClass {
public static void main(String[] args) {
	
	Scanner s = new Scanner (System.in);
	 System.out.println("Enter the phno");
	 String line = s.nextLine();
	 System.out.println(line);
	long l = s.nextLong();
	System.out.println("String"+l);
	String line1 = s.nextLine();
	  System.out.println("integer num "+line1);  
	  int i = s.nextInt();
}

}
