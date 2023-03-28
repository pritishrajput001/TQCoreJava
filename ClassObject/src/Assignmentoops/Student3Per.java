package Assignmentoops;

public class Student3Per {

	int num1, num2, num3, total;
	float per;

	Student3Per(int sub1, int sub2, int sub3) {
		num1 = sub1;
		num2 = sub2;
		num3 = sub3;
	}

	void cal() {
		total = num1 + num2 + num3;
		per = total / 3.0f;
		System.out.println("Total marks are " + total);
		System.out.println("Percentage = " + per);
	}

	public static void main(String args[]) {
		Student3Per s = new Student3Per(46, 96, 89);
		Student3Per s2 = new Student3Per(86, 97, 79);
		Student3Per s3 = new Student3Per(49, 88, 35);
		Student3Per s4 = new Student3Per(58, 74, 53);
		s.cal();
		s2.cal();
		s3.cal();
		s4.cal();

	}

}
