package com.example;

import java.util.Scanner;

public class Cvds {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character");
		char ch = sc.next().charAt(0);

		int flag = 0;
		
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
	    
			System.out.println("It is vowel");
			flag = 1;
			break;

		}
		if (flag == 0) {
			System.out.println("It is consonant");
		}
	    
		switch (ch) {
		flag = 2;
	    case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
        case '0':
			
        	System.out.println("It is digit");
        	flag = 2;
        	break;
		}
		
		
		if (flag ==2) {
			System.out.println("It is digit");
		}
		}

}
