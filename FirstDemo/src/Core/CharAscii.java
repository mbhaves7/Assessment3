package Core;

import java.util.Scanner;

public class CharAscii {

	public static void main(String[] args) {
		
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter haracter value from ascii");
		
		 ch= sc.next().charAt(0);
		
		 int i = ch ;
		
		 System.out.println("Ascii value of Character "+ch +"is "+i);
	}
}
