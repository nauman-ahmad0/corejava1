package corejava;

import java.util.Scanner;

public class CharacterInput {
	
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Any character");
	char a=scanner.next().charAt(0);
	if(a=='A'||a=='a'||a=='E'||a=='e'||a=='I'||a=='i'||a=='O'||a=='o'||a=='U'||a=='u') {
		System.out.println("The character is Vowel");
	}
	else {
		System.out.println("The character is consonant");
	}
}
	
	
}
