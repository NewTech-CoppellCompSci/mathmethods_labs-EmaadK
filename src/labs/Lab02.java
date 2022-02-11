package labs;

import java.util.Random;
import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number. ");  
		int max = scan.nextInt();
		System.out.println("Enter a number. "); 
		int min = scan.nextInt();
		// create instance of Random class
		  Random randomNum = new Random();
		  int showMe = min + randomNum.nextInt(max);
		  System.out.println(showMe);
		
		
		
	}
	
	
	
	
	public static void problem02() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter height. "); 
		int height=scan.nextInt();  
		System.out.println("Enter radius. "); 
	    int radius=scan.nextInt();  
	    double pi=3.14;  
	    double volume=pi*(radius*radius)*height;  
	        System.out.println("Volume of the cylinder = "+volume);
		
		
	}

	
	

	public static void problem03() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x1. ");
		double x1 = scan.nextInt();
		System.out.println("Enter y1. ");
	    double y1 = scan.nextInt();
	    System.out.println("Enter x2. ");
	    double x2 = scan.nextInt();
	    System.out.println("Enter y2. ");
	    double y2 = scan.nextInt();
	    int st1 = (int) (x2 - x1);
	    int st2 = (int) (y2 - y1);
	    int st3 = (int) (st1 + st2);
	    System.out.println(Math.sqrt(st3));

	}


	
	
	public static void problem04() {
		double secondRoot = 0, firstRoot = 0;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a-value: ");
	      double a = sc.nextDouble();

	      System.out.println("Enter b-value: ");
	      double b = sc.nextDouble();

	      System.out.println("Enter c-value: ");
	      double c = sc.nextDouble();

	      double determinant = (b*b)-(4*a*c);
	      double sqrt = Math.sqrt(determinant);

	      if(determinant>0){
	         firstRoot = (-b + sqrt)/(2*a);
	         secondRoot = (-b - sqrt)/(2*a);
	         System.out.println("x1 = "+ firstRoot);
	         System.out.println("x2 = "+ secondRoot);
	      }else if(determinant == 0){
	         System.out.println("Root is :: "+(-b + sqrt)/(2*a));
	      }
		
		
		
	}
	
	

	
}
