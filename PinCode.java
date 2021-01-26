import java.util.regex.*;

class PinCode{

	public static void main(String args[]){

		Pattern pat = Pattern.compile("^[0-9]{6}");
		Matcher match = pat.matcher("A400088");
		boolean result = match.matches();
		System.out.println(result);
	}
}
