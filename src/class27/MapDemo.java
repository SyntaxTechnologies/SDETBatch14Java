package class27;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {

        HashMap<String,String> data=new HashMap<>();
        data.put("UserName","Anton123"); // This is how we store info inside a map
        data.put("Password","pass123");

        System.out.println(data);
        System.out.println(data.get("Password")); // This is how we can get back the values
    }
}
