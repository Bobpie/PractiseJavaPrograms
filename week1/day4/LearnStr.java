package week1.day4;

public class LearnStr {
public static void main(String[] args) {
	// String Literal
	String str1 = "Testleaf";
	String str2 = "Testleaf";
	//share the same memory same memory location
	System.out.println(str1.equals(str2));
	
	// String obj
	String str3 = new String("Testleaf");
	String str4 = new String("Testleaf");
	System.out.println(str3.equals(str4));
	
}
}
