package utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {

    // Break till 1:25

    // We created this method so that everytime we need to read the data from Excel file we can reuse this method
    public static List<Map<String, String>> read(String path) {

        XSSFWorkbook excel = null;
        FileInputStream fis = null;
        List<Map<String, String>> excelData = null;
        try {
            // Reads the data from HardDrive brings it to RAM in the raw form 10101010101010
            // In simple words we can say computer has navigated to that file
            fis = new FileInputStream(path);
            // this class converts the raw bytes to Excel format or in simple words it is that special software
            // that helps us read and write data to an Excel file.
            excel = new XSSFWorkbook(fis);
            Sheet sheet = excel.getSheet("Sheet1");
            int noOfRow = sheet.getPhysicalNumberOfRows();
            // getting the first row so that we can use it as keys for our map
            Row headerRow = sheet.getRow(0);
            // the Map that will store the data for each row
            excelData = new ArrayList<>(); // a list that can hold maps

            // A loop that goes through all the rows that contain the data.
            for (int rowNo = 1; rowNo < noOfRow; rowNo++) {
                LinkedHashMap<String, String> rowMap = new LinkedHashMap<>();
                // get a dataRow from sheet one by one through loop
                Row dataRow = sheet.getRow(rowNo);
                // getting the count of how many cells contain the data
                int noOfCell = dataRow.getPhysicalNumberOfCells();
                // A loop to go through all the cells
                for (int cellNo = 0; cellNo < noOfCell; cellNo++) {

                    //getting keys from header row and values from data row
                    String key = headerRow.getCell(cellNo).toString();
                    String value = dataRow.getCell(cellNo).toString();
                    rowMap.put(key, value);
                }
                excelData.add(rowMap);
                // System.out.println(rowMap);
            }
        } catch (IOException f) {
            f.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return excelData;
    }
}
