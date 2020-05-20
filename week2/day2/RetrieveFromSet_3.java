package week2.day2;

import java.util.*;

public class RetrieveFromSet_3 {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);
		set.forEach((eachNum) -> {
			if (eachNum == 7)
				System.out.println(eachNum);
		});
	}
}
