package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties read (String path)  {

       var properties = new Properties(); // that special software which helps us read data from that file
        try {
            var fileInputStream = new FileInputStream(path); //it helps us Navigate to the file
            properties.load(fileInputStream); //loads all the data from the file inside(Memory)
        }catch ( FileNotFoundException e){
           // System.out.println("Please check your file path"); normal humans no technical background
            e.printStackTrace(); // wen programmers will use this code
        }catch (IOException e){
            //System.out.println("Please check your hardrive");
        }

        return properties;


    }
}
