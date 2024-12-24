package com.xworkz.view;

import com.xworkz.view.item.Item;
import com.xworkz.view.stationaryItems.StationaryItems;

import java.util.Scanner;

public class StationaryItemsRunner {
    public static void main(String[] args) {
        StationaryItems stationaryItems = new StationaryItems();
        Item item = new Item();
        Scanner s=new Scanner(System.in);
       // System.out.println(item);
        System.out.println("Enter the item id:");
        int itemId=s.nextInt();
        item.setId(itemId);
        System.out.println("Enter item name: ");
        String itemName=s.next();
        item.setName(itemName);
        System.out.println("Enter item type: ");
        String itemTye=s.next();
        item.setType(itemTye);
        System.out.println("Enter item price: ");
        double price=s.nextDouble();
        item.setPrice(price);
        System.out.println(item);

      /* Item item1 = new Item();
        System.out.println(item1);
        item1.setId(11);
        item1.setName("Pencil");
        item1.setType("Eco-friendly");
        item1.setPrice(5.00);
        System.out.println(item1);

        int hashCode=item1.hashCode();
        System.out.println(hashCode);
        boolean equal=item1.equals(item);
        System.out.println(equal);
*/

//        boolean isItemAdded= stationaryItems.addItem(item);
//        System.out.println("Is item added: "+isItemAdded);
//        stationaryItems.getItemDetails();
    }
}
