package week1.day1;

public class Reverse_2 {
public static void main(String[] args) {
	// Verify the reverse and orginal are same
	String str = "testleaf";
	// Creating an empty String to store the reversed value
	String rev = "";
	// Iterate over the original string
	for (int i = str.length()-1 ; i >=0; i-- ) {
		rev += str.charAt(i);
	}
	// Condition ? True Statement : False Statement
	System.out.println(str.equals(rev)?"Yes, Palindrome":"No, Not a Palindrome");
}
}
