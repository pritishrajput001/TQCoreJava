package Test5;

import java.util.Scanner;

public class CricketerTest {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		Cricketer cric[] = new Cricketer[5];

		for (int i = 0; i < 5; i++) {
			cric[i] = new Cricketer();
			System.out.println("Enter id");
			cric[i].setPlayerId(sc.nextInt());

			System.out.println("Enter name");
			cric[i].setName(sc.next());

			System.out.println("Enter baller or not ");
			cric[i].setBaller(sc.nextBoolean());

			System.out.println("Enter Strike rate");
			cric[i].setStrikeRate(sc.nextFloat());

			System.out.println("Enter runs");
			cric[i].setRuns(sc.nextDouble());

		}
		sc.close();
	}

}
