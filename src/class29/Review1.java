package class29;

import utils.ExcelReader;

import java.io.IOException;

public class Review1 {
    /*
    we wanted to read data from files
     */

    public static void main(String[] args) throws IOException {

        String path="/Users/apple/IdeaProjects/SDETBatch14Java/Data/Book.xlsx";
      var data=  ExcelReader.read(path);

       /* Map<String ,String> row1=data.get(0);
        System.out.println(row1.get("Name"));*/

   /*     for (var row:data
             ) {
            System.out.println(row);
        }*/
        System.out.println(data);
        
    }

}
