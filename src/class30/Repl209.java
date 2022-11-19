package class30;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Repl209 {
    /*
    "Items", "Apple"

"Price", 20.00

"Quantity", 10



"Items", "Orange"

"Price", 21.99

"Quantity", 10
     */
    public static void main(String[] args) {
        List<Map<String,Object>> dataList=new ArrayList<>();
        Map<String,Object> appleMap=new LinkedHashMap<>();
        appleMap.put("Items","Apple");
        appleMap.put("Price",20.00);
        appleMap.put("Quantity",10.0);

        Map<String,Object> orangeMap=new LinkedHashMap<>();
        orangeMap.put("Items","Orange");
        orangeMap.put("Price",21.99);
        orangeMap.put("Quantity",10.0);

        dataList.add(appleMap);
        dataList.add(orangeMap);

    double price=0;
        double quantity=0;
        double total=0;
        for(Map<String,Object> listData:dataList){
            for(Map.Entry<String,Object> entry:listData.entrySet()){
                if(entry.getKey().equals("Price")){
                    //price=Double.parseDouble(entry.getValue().toString());
                    price=(double) entry.getValue();
                }else if(entry.getKey().equals("Quantity")){
                    quantity=(double)entry.getValue();
                }
                System.out.println(entry.getKey()+": "+entry.getValue()+" ");
            }
            total+=price*quantity;
            System.out.println("SubTotal "+(price*quantity));
        }
        System.out.println("Your purchase total :"+(total));



    }
}
