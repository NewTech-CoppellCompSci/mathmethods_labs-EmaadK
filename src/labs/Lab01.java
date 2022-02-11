package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number. ");
		int input = scan.nextInt();
		System.out.println("Enter a number. ");
		int input2 = scan.nextInt();
		int ans = (int) Math.pow(input,input2);
		System.out.println(input+"^"+input2+" = "+ans);
	}
	
	
	
	
	public static void problem02() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number. ");
		int input = scan.nextInt();
		double x = input;
		// Input positive value, Output square root of x.
		System.out.println(Math.sqrt(x));
		
	}

	
	

	public static void problem03() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number. ");
		int adjacent = scan.nextInt();
		System.out.println("Enter a number. ");
		int opposite = scan.nextInt();
		int hypotenuse;          
        hypotenuse= (int) Math.sqrt((adjacent*adjacent)+(opposite*opposite));
        System.out.println("The length of the hypotenuse is: " + hypotenuse);
		

	}


	
	
	public static void problem04() {
		
	    int counter = 0;
	    double even = 0;
	    double odd = 0;
	    double sum = 0;
	    int input = 0;
	    int large = 0;
	    int small = 0;
	    double average;

	    System.out.print("Enter a series of values (0 to quit): ");
	    Scanner in = new Scanner(System.in);

	    while ((input = in.nextInt()) != 0) {

	        small = in.nextInt();
	        large = in.nextInt();

	        if (input != 0)
	            sum = input + sum;
	            counter++;

	        if (input > large)
	            large = input;

	        if (input < small)
	            small = input;

	        if (input % 2 == 0)
	            even = even + 1;
	        else
	            odd = odd + 1;

	        }

	    if (counter > 0) {

	        average = sum / counter;

	        System.out.println("The smallest integer is: " + small);
	        System.out.println("The largest integer is: " + large);

	    } else {

	            System.out.println("No data was entered.");
	        }

	    }
	
		
	}
	
	
	
	
	
	

