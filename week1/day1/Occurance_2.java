package week1.day1;

public class Occurance_2 {
public static void main(String[] args) {
	String str = "You have no choice other than following me!";
	int count = 0;
	for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)=='o') {
			count++;
		}
	}
	System.out.println("Occurance of 'O' is: "+count);
}
}
