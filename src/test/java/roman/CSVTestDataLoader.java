package roman;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVTestDataLoader {

	public CSVTestDataLoader() {

	}

	public Object[][] loadData(String csvFile) throws IOException {

		ArrayList<String> csvData = new ArrayList<String>();
		BufferedReader bReader = new BufferedReader(new FileReader(csvFile));
		String line = "";
		while ((line = bReader.readLine()) != null) {

			csvData.add(line);

		}
		bReader.close();

		Object[][] dataArray = getDataCollection(csvData);

		return dataArray;
	}

	/**
	 * Pass in a string with one comma and indicate whether you want the
	 * substring before or after the comma returned.
	 * 
	 * @param line
	 * @param beforeComma
	 * @return
	 */
	public static String getValFromCSV(String line, boolean beforeComma) {

		int commaPos = line.indexOf(",");

		if (beforeComma == true) {
			return line.substring(0, commaPos);
		} else {

			return line.substring(commaPos + 1);
		}

	}

	private Object[][] getDataCollection(ArrayList<String> listOfData) {

		int rows = listOfData.size();
		Object[][] myData = new Object[rows][2];

		for (int r = 0; r < rows; r++) {
			String currentLine = listOfData.get(r);
			System.out.println(currentLine);
			myData[r][0] = CSVTestDataLoader.getValFromCSV(currentLine, true);
			myData[r][1] = CSVTestDataLoader.getValFromCSV(currentLine, false)
					.toString();

		}

		return myData;

	}

}
