package experiments;

import java.util.Scanner;

//Write a Java program to accept a number and check the number is even or not.Prints 1 if the number is evcn or 0 if the number is odd
public class Code3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num=sc.nextInt();
		
        if(num%2==0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
			
	}

}
