package roman;

public class RomanNumeral1 {
	
	public static String convertToRoman(int num){
		String romanNumber = null;
		String numToConvert = Integer.toString(num);
		int numLength = numToConvert.length();
		
		if(numLength==1){
			romanNumber = getSingleNumber(num);
		}		
		if(numLength==2){
			String romanUnit, romanTens;
			String units = numToConvert.substring(numLength-1);
			String tens = numToConvert.substring(numLength-2);
			if(units!="0"){
				romanUnit = getSingleNumber(Integer.parseInt(units));
				romanTens = getTens(Integer.parseInt(tens));
				romanNumber = romanTens+romanUnit;
			}
			System.out.println("Calling get tens with: "+Integer.parseInt(tens));
			romanNumber = getTens(Integer.parseInt(tens));
		}
		
		return romanNumber;
	}


	public static String getSingleNumber(int num) {
		switch(num){
		case 1: return "I";
		case 2: return "II";
		case 3: return "III";
		case 4: return "IV";
		case 5: return "V";
		case 6: return "VI";
		case 7: return "VII";
		case 8: return "VIII";
		case 9: return "IX";
		default: return "ugh!";
		}
	}
	
	private static String getTens(int num) {
		switch(num){
		case 1: return "X";
		case 2: return "XX";
		case 3: return "XXX";
		case 4: return "IL";
		case 5: return "L";
		case 6: return "LX";
		case 7: return "LXX";
		case 8: return "LXXX";
		case 9: return "XC";
		default: return "tens ugh!";
		}
	}


}
