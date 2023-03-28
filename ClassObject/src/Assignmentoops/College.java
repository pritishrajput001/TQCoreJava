package Assignmentoops;

public class College {
	int id;
	String name;
	String code;

}

class CollegeInfo {
	public static void main(String args[]) {
		College c1 = new College();
		College c2 = new College();
		c1.name = "DIEMS";
		c1.code = "DIMS990";
		c1.id = 7831;
		c2.name = "JNEC";
		c2.code = "795JNEC";
		c2.id = 8456;
		System.out.println("College name is  " + c1.name + " code is " + c1.code + " id is " + c1.id);
		System.out.println("College name is  " + c1.name + " code is " + c2.code + " id is " + c2.id);

	}
}
