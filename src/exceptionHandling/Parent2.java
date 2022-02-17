package exceptionHandling;

import java.io.*;    
class Parent{    
	
	
  void msg() {  
    System.out.println("parent method");  
  }    
}    
    
class TestExceptionChild1 extends Parent{  
	
	
  void msg()throws ArithmeticException {    
    System.out.println("child method");    
  }    
  
  public static void main(String args[]) {    
   Parent p = new TestExceptionChild1();    
   p.msg();    
  }    
}   