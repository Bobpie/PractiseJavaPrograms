package week2.day2;

import java.util.*;

public class RemoveDuplicates_1 {
public static void main(String[] args) {
	List<String> str = new ArrayList<String>();
	str.add("A");
	str.add("B");
	str.add("C");
	str.add("D");
	str.add("A");
	str.add("D");
	str.add("E");
	str.add("F");
	Set<String> set = new LinkedHashSet<String>(str);
	System.out.println(set);
	
}
}
