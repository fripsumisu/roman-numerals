package roman;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;

import roman.RomanNumeral1;
import roman.RomanNumeral2;
import roman.CSVTestDataLoader;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RomanNumeralTest {

	private String arabNumber;
	private String romanNumber;

	@Parameters
    public static Collection data() throws IOException {
		
		CSVTestDataLoader myCSV = new CSVTestDataLoader();
		
		Object[][] csvLines = myCSV.loadData("src/test/resources/roman/romanNumeralTestData.csv");
				
		
        return Arrays.asList(csvLines);
                
    }

	public RomanNumeralTest(String number, String roman) {
		super();
		arabNumber = number;
		romanNumber = roman;
	}

	/*
	 * @Test public void testGetRomanNumber1(){ String valueReturned =
	 * RomanNumeral1.convertToRoman(arabNumber);
	 * Assert.assertEquals(romanNumber, valueReturned);
	 * System.out.println("Number in: "
	 * +arabNumber+"; Value returned: "+romanNumber); }
	 */

	@Test
	public void testGetRomanNumber2() {
		String valueReturned = RomanNumeral2.convertToRoman((Integer.parseInt(arabNumber)));
		Assert.assertEquals(romanNumber, valueReturned);
		System.out.println("Number in: " + arabNumber + "; Value returned: "
				+ romanNumber);
	}
}
