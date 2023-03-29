package ImpProgramOnString;

public class ChangeCaseOfVowels {

        public static void changecase(String str)
        {
        	String newStr = "";

	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);

	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
	                if (Character.isLowerCase(c)) {
	                    newStr += Character.toUpperCase(c);
	                }
	                else {
	                    newStr += Character.toLowerCase(c);
	                }
	            }
	            else {
	                newStr += c;
	            }
	        }

	        System.out.println("Original String: " + str);
	        System.out.println("New Changed string : " + newStr);
        }
	
	    public static void main(String[] args) {
	        String str = "Hello World! my name is zanjad SUYOG HARIBhau";
	        changecase(str);
	        
	       
	        
	    }
	}

