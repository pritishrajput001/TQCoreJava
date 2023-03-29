package Test1;
import java.util.Scanner;
public class LargestOfThree {
	public static void main(String args[]) {
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		num1 = sc.nextInt();
		System.out.println("Enter second number");
		num2 = sc.nextInt();
		System.out.println("Enter third number");
		num3 = sc.nextInt();
		if(num1>num2&&num1>num3) 
		{
				
			System.out.println("Largest no is "+num1);
		}
		else if(num2>num3) 
		{
			System.out.println("Largest num is "+num2);
		}
		else
		{
			System.out.println("Largest num is "+num3);
			
		}
	}

}
