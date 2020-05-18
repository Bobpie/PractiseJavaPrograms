package week2.day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintList_3 {
public static void main(String[] args) {
	String str = "Bugatti Chiron";
	List<Character> lst = new ArrayList<Character>();
	for(int i = 0; i < str.length();i++) {
		lst.add(str.charAt(i));
	}
	Iterator<Character> iterator = lst.iterator();
	while(iterator.hasNext()) {
		System.out.print(iterator.next());
	}
}
}