package week1.day1;

public class Occuranc_3 {
public static void main(String[] args) {
	String str = "You have no choice other than following me!";
	// I need to find the no of 'o' in the string
	
	// Create a counter variable to count the number of 'o'
	int count = 0;
	
	// Converting sentence into sequence of characters
	char[] array = str.toCharArray();
	
	for (int i = 0; i < array.length; i++) {
		if(array[i]=='o') {
			count = count+1;
		}
	}
	
	// Print the value of the count
	System.out.println("Occurance of o is: "+ count);
	
	
}
}
