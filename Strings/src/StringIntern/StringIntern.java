
package StringIntern;

public class StringIntern {
	public static void main(String args[]) {
		String s1 = new String("Java");
		String s2 = s1.intern();

		System.out.println(s1 = s2);
		String str1 = "Java";
		String str2 = new String("Java");

		System.out.println(str1 == str2);
		str2 = str2.intern(); // pointing to SCP

		System.out.println(str1 == str2);
	}

}
