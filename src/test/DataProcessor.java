package test;

import java.io.IOException;

import javax.swing.JFrame;

import org.apache.poi.hssf.usermodel.*;

public class DataProcessor {
	
	private JFrame mainFrame = new JFrame("Data Processor");

	public void initMainFrame(int width, int height, int xLoc, int yLoc) {
		mainFrame.setSize(width, height);
		mainFrame.setLocation(xLoc, yLoc);
	}
	
	public static void main(String[] args) {
		HSSFWorkbook wb = null;
		try {
			wb = DataImporter.importWorkbook("/Users/patrikek/Documents/testExport.xls");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
