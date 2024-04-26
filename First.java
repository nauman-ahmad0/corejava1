package corejava;

import java.util.Scanner;

public class First {
	public void getInput(){
		
		Scanner scanner=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter first number");
		a=scanner.nextInt();
		System.out.println("Enter second number");
		b=scanner.nextInt();
		c=a+b;
		System.out.println("The Result is=" +c);
		
	}
	public static void main(String[] args) {
		
		First first=new First();
		first.getInput();
	}

}
