import java.util.*;

public class Main{
	public static void main(String[] args){

		
		
	}
}



class Parent{
	public void one(){
		System.out.print("This is first function");
	}

	public void two(){
		System.out.print("This is Second Function");
	}
}


class Child extends Parent{
	public void one(){
		System.out.print("This is called overriding method");
	}
}