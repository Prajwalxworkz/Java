package com.xworkz.view.stationaryItems;

import com.xworkz.view.item.Item;

public class StationaryItems {
    Item item;
    public boolean addItem(Item item){
        boolean isItemAdded=false;
        if(item!=null){
            if(item.getId()>0 && item.getName()!=null){
                this.item=item;
            }
        }
        else{
            System.out.println("Item fields are empty");
        }
        return isItemAdded;
    }

    public void getItemDetails(){
        System.out.println("The item id is "+item.getId());
        System.out.println("The item name is "+item.getName());
        System.out.println("The item type is "+item.getType());
        System.out.println("The item price is "+item.getPrice());
    }
}
