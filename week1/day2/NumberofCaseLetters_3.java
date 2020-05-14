package week1.day2;

public class NumberofCaseLetters_3 {
public static void main(String[] args) {
	String str = "1. It is Work from Home  not Work for Home";
	int upper = 0, lower = 0, numbers = 0, spaces = 0;
	for (int i = 0; i < str.length(); i++) {
		if((int)str.charAt(i) >= 48 && (int)str.charAt(i) <= 57) {
			numbers++;
		}
		else if((int)str.charAt(i) >= 65 && (int)str.charAt(i) <= 90) {
			upper++;
		}
		else if((int)str.charAt(i) >= 97 && (int)str.charAt(i) <= 122) {
			lower++;
		}
		else if((int)str.charAt(i) == 32) {
			spaces++;
		}
	}
	System.out.println("Numbers: "+numbers);
	System.out.println("Upper case: "+upper);
	System.out.println("Lower case: "+lower);
	System.out.println("Space: "+spaces);
}
}
