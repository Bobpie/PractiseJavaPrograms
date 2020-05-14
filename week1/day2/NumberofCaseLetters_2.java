package week1.day2;

public class NumberofCaseLetters_2 {
public static void main(String[] args) {
	String str = "1. It is Work from Home  not Work for Home";
	int upper = 0, lower = 0, numbers = 0, spaces = 0;
	for (int i = 0; i < str.length(); i++) {
		if(Character.isDigit(str.charAt(i))) {
			numbers++;
		}
		else if(Character.isUpperCase(str.charAt(i))) {
			upper++;
		}
		else if(Character.isLowerCase(str.charAt(i))) {
			lower++;
		}
		else if(Character.isSpaceChar(str.charAt(i))) {
			spaces++;
		}
	}
	System.out.println("Numbers: "+numbers);
	System.out.println("Upper case: "+upper);
	System.out.println("Lower case: "+lower);
	System.out.println("Space: "+spaces);
}
}
