import java.util.regex.*;

class PinCode{

	public static void main(String args[]){

		Pattern pat = Pattern.compile("^[0-9]{3}\\s[0-9]{3}$");
		Matcher match = pat.matcher("400 088");
		boolean result = match.matches();
		System.out.println(result);
	}
}
