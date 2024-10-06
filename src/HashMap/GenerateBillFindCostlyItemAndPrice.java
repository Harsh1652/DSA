package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class GenerateBillFindCostlyItemAndPrice {
    public static void main(String[] args) {

        HashMap<String,Integer> mpp = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Total no of items: ");
        int totalItem = sc.nextInt();

        String costlyItem = null;
        int maxPrice = Integer.MIN_VALUE;

        for (int i = 0; i< totalItem; i++){

        System.out.println("Enter Name of an Item");
        String name = sc.nextLine();
        System.out.println("Enter price of an Item");
        int price = sc.nextInt();

        mpp.put(name,price);
            if (price > maxPrice){
                maxPrice = price;
                costlyItem = name;
            }
        }


        if (costlyItem != null) {
            System.out.println("The most costly item is: " + costlyItem + " with a price of: " + maxPrice);
        } else {
            System.out.println("No items found.");
        }
    }
}
