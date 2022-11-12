package class28;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo2 {
    public static void main(String[] args) throws IOException {

        String path="/Users/apple/IdeaProjects/SDETBatch14Java/Data/Test.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook excel=new XSSFWorkbook(fileInputStream);
        Sheet sheet=excel.getSheet("Sheet1");
        int noOfRows= sheet.getPhysicalNumberOfRows(); // returns how many rows in actual contains the data in sheet
        System.out.println(noOfRows);
        for (int i = 0; i < noOfRows; i++) {
            Row row= sheet.getRow(i);
            int noOfCell=row.getPhysicalNumberOfCells(); // returns the total number of cells that contain the data
            for (int j = 0; j <noOfCell ; j++) {
                Cell cell=row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }
    }
}
