package week2.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateCharacters_1 {
public static void main(String[] args) {
	Set<Character> set = new LinkedHashSet<Character>();
	String str = "When life gives you lemons, make lemonade";
	for (int i = 0; i < str.length(); i++) {
		if(!set.add(str.charAt(i))) {
			System.out.print(str.charAt(i)+",");
		}
		
	}
}
}
