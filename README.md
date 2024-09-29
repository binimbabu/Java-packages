Java Packages


package p1;
public class A{

public static void a1(){
        System.out.println("Inside p2 Class A a1 block");
  }

public void a2(){
        System.out.println("Inside p2 Class A block");
  }

}

package p1;

public class B {

  public static void main(String args[]) {
	  A aObject = new A();
	  aObject.a2();
	  aObject.a1();
  }
  
}



Class A and class B are of same package 'p1' , hence Class B can access the methods a1() and a2() in class A since they are in same package 'p1' and the methods are specified in public.




package p2;
import p1.A;

public class C {

	public static void main(String[] args) {
         A a = new A();
         a.a2();
         A.a1();
	}

}

The class C is in package 'p2', hence class A methods even though public not accessible to class C. For the class A public methods to be accessible to class C , we should import the class (i.e   import p1.A;).


If in package p2 create another class of same name 'A'. To differentiate class A from package p1 and p2 and call methods from class A from package p1 in class C (in package p2). We provide this command ( p1.A.a1(); ).



package p2;
import p1.*;

public class C {

	public static void main(String[] args) {
     p1.A.a1();
	}

}




package p2;

public class A {
	public void a3() {
		System.out.println("Inside p2 Class A");
	}
	public static void main(String[] args) {
	}

}



Creating a subpackage in package, here in the code below class E is created in subpackage p3 in p1 , for the class B to access class E in the subpackage p3 in p1 we need to import (i.e  import p1.p3.E;  ).



package p1.p3;

public class E {
	public void a4() {
		System.out.println("Inside p1.p3 a4 block");
	}

	public static void main(String[] args) {
	}
}



package p1;

import p1.p3.E;

public class B {

	public static void main(String args[]) {
		A aObject = new A();
		aObject.a2();
		aObject.a1();
		E eobject = new E();
		eobject.a4();
	}

}



Output


Inside a2 block
Inside p2 Class A
Inside p1.p3 a4 block




Importing using built in classes


package com.bini.babu;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {12
		System.out.println("Enter 2 numbers");
		Scanner scanner = new Scanner(System.in);
		int num1 = Integer.parseInt(scanner.next());
		int num2 = Integer.parseInt(scanner.next());
		int result = num1 + num2;
		System.out.println("Result: " + result);

	}

}




In the above code 'Scanner scanner = new Scanner(System.in);' is to get the input from the console window. 'scanner.next()'  move to next Integer by clicking enter or space to enter the next number.
