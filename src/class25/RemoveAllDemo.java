package class25;

import java.util.ArrayList;

public class RemoveAllDemo {
    public static void main(String[] args) {
        ArrayList<String> makeUpItem=new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("eyeLinear");
        makeUpItem.add("lipstick");


        ArrayList<String> itemsToBeRemoved=new ArrayList<>();
        itemsToBeRemoved.add("Blush");
        itemsToBeRemoved.add("Base");
        itemsToBeRemoved.add("concealer");
        itemsToBeRemoved.add("Josh");

        makeUpItem.removeAll(itemsToBeRemoved);
   // makeUpItem.clear();  // it removes everything
        System.out.println(makeUpItem);

    }
}
