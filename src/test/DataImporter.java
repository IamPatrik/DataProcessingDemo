/**
 * File which takes a file and imports data into a given format
 * 
 * @author patrikek
 *
 */
package test;

import java.lang.IndexOutOfBoundsException;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.*;

public class DataImporter {
	
	/**
	 * 
	 * @param filename
	 * @return
	 * @throws IOException
	 */
	public static HSSFWorkbook importWorkbook (String filename) throws IOException {
		FileInputStream iStream = new FileInputStream(filename);
		return new HSSFWorkbook(iStream);
	}
	
	public static void printWorksheet(HSSFWorkbook workbook, int idx){
		int nbrSheets = workbook.getNumberOfSheets();
		if (idx<0) {
			HSSFSheet sheet= workbook.getSheetAt(0);
		} else if (idx >= nbrSheets) {
			throw new IndexOutOfBoundsException("The there are only " + nbrSheets + "sheets in the workbook!");
		} else {
			HSSFSheet sheet= workbook.getSheetAt(idx);
		}
	}
}
