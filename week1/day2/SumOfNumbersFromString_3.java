package week1.day2;

public class SumOfNumbersFromString_3 {
	public static void main(String[] args) {
		String str = "asdf1qwer9as8d7";
		int sol = 0;
		for (int i = 0; i < str.length(); i++) {
			int temp = str.charAt(i);
			if (temp >= 48 && temp <= 57) {
				sol += Integer.parseInt(String.valueOf(str.charAt(i)));
			}
		}
		System.out.println(sol);
	}
}
