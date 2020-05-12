package week1.day1;

public class Occurance_1 {
public static void main(String[] args) {
	String str = "You have no choice other than following me!";
	String replacedStr = str.replaceAll("[^o]", "");
	System.out.println("Occurance of O: "+replacedStr.length());
}
}
