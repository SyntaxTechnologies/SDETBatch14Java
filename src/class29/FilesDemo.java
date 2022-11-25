package class29;

import utils.ConfigReader;
import utils.ExcelReader;

public class FilesDemo {
    public static void main(String[] args)  {
        String path="/Users/apple/IdeaProjects/SDETBatch14Java/Data/config.properties";
      var properties=  ConfigReader.read(path);
        System.out.println(properties.getProperty("browser"));


        String excelPath="/Users/apple/IdeaProjects/SDETBatch14Java/Data/Test.xlsx";
       var excelData=  ExcelReader.read(excelPath);
        System.out.println(excelData);

    }
}
