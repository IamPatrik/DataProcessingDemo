/**
 * File which takes a file and imports data into a given format
 * 
 * @author patrikek
 *
 */
package test;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.*;

public class DataImporter {
	
	/**
	 * 
	 * @param filename - Full path plus the name of the file
	 * @return a HSSFWorkbook with the data from filename
	 * @throws IOException if the file cannot be imported or if the file cannot be parsed
	 */
	public static HSSFWorkbook importWorkbook (String filename) throws IOException {
		FileInputStream iStream = new FileInputStream(filename);
		return new HSSFWorkbook(iStream);
	}
}
