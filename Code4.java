package experiments;

import java.util.Scanner;

//Write a Java program that accepts three integers from the user and return true if the second number is greater than first number and third number is greater than second number. If "abc" is true second number does not need to be greater than first number. 
public class Code4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a=sc.nextInt();
		
		System.out.println("Enter second number");
		int b=sc.nextInt();
		
		System.out.println("Enter third number");
		int c=sc.nextInt();
		
		boolean result=(b>a)&&(c>b);
		System.out.println("Result:" + result);
		
			
	}

}
