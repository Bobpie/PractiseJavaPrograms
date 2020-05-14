package week1.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate_Email {
public static void main(String[] args) {
	String str = "._@gmail.com";
	String pattern = "[a-zA-Z0-9._]+@[a-z0-9]+.[a-z.]{2,}";
	Pattern compile = Pattern.compile(pattern);
	Matcher matcher = compile.matcher(str);
	System.out.println(matcher.matches());
}
}
