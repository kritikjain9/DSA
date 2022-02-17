package exceptionHandling;

import java.io.*;
import java.io.FileNotFoundException;

public class Main {
	
	public static void solver() {
		try {
			int g = 10/0;
			System.exit(g);
		}finally {
			System.out.println("nahi aaya :(");
		}
	}
	
	public static void validate (int num) {
		if(num < 10)
			throw new ArithmeticException("Please go out and play with dolls");
		
		System.out.println("You are welcome");
	}
	
	
	
	public static void aaja() {
		try{
			FileInputStream x = new FileInputStream("Users/Downloads/kj.jpeg");
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void fun() {
		try {
			int a = 10/0;
		}
		catch(Exception e){
			int b = 10/0;
		}
		finally {
			System.out.println("aaya ya nahi");
		}
	}
	
	public static void tryyy() {
		try {
			int a = 1/0;
			return;
		}catch(Exception e) {
			System.out.println(e);
			return;
		}
		finally {
			System.out.println("return ke baad bhi chala");
		}
	}
		
	 public static void main(String args[]){  
		tryyy();
//		 aaja();
//		 validate(2);
//		 solver();
	 }
}