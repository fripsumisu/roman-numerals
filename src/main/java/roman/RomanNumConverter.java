package roman;

import java.lang.NumberFormatException;

/**
 *
 * 
 */
public class RomanNumConverter {
	public static void main(String[] args) {
		String errMessage = "Please try again: enter a whole number, no text or decimals.";
		try {

			int inputNum = Integer.parseInt(args[0]);
			String outputNum = RomanNumeral2.convertToRoman(inputNum);

			System.out.print(outputNum);
		} catch (NumberFormatException numEx) {
			System.out
					.println(errMessage);
		}
	}
}
