package week1.day2;

public class SumOfNumbersFromString_1 {
	public static void main(String[] args) {
		String str = "asdf1qwer9as8d7";
		int sol = 0;
		String numbers_str = str.replaceAll("[^0-9]", "");
		int num = Integer.parseInt(numbers_str);
		while (num > 0) {
			sol += num % 10;
			num /= 10;
		}
		System.out.println(sol);
	}
}
