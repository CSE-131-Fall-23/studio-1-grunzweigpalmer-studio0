package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a year to determine if it is a leap year: ");
		int year = scan.nextInt();
		boolean divideFour = ((year%4) == 0);
		boolean divideHundred = ((year%100) != 0);
		boolean divideFH = ((year%400) == 0);
		boolean isLeapYear = (divideFour && divideHundred) || divideFH;
		System.out.println("The answer is: " + isLeapYear);
	
		
		
	}

}
