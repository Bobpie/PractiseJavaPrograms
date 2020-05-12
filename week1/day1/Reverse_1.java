package week1.day1;

public class Reverse_1 {
public static void main(String[] args) {
	// Given String
	String str = "malayalam";
	
	StringBuffer stb = new StringBuffer(str);
	StringBuffer reverse = stb.reverse();
	String rev = reverse.toString();
	
	if(rev.equals(str)) {
		System.out.println("Yes, Palindrome");
	}
	else {
		System.out.println("No, Not a Palindrome");
	}
}
}
