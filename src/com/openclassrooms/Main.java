package com.openclassrooms;

import com.openclassrooms.store.Brand;
import com.openclassrooms.store.Inventory;
import com.openclassrooms.store.Mouse;
import com.openclassrooms.store.Screen;

public class Main {

    public static void main(String[] args) {
    	
        Inventory inventory = new Inventory();
        
        inventory.addItem(new Mouse(Brand.DELL, 20.0));
        inventory.addItem(new Mouse(Brand.DELL, 20.0));
        inventory.addItem(new Mouse(Brand.DELL, 20.0));
        inventory.addItem(new Mouse(Brand.DELL, 20.0));
        inventory.addItem(new Mouse(Brand.DELL, 30.0));
        inventory.addItem(new Screen(Brand.Samsung, 150.0, "1920x1080"));
        inventory.addItem(new Screen(Brand.Samsung, 150.0, "1920x1080"));
        inventory.addItem(new Screen(Brand.Samsung, 150.0, "1920x1080"));

        System.out.println(inventory);
    }
}
