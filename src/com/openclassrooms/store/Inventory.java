package com.openclassrooms.store;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    public Map<Item, Integer> itemList;

    public Inventory() {
    	itemList = new HashMap<Item, Integer>();
    }

    public void addItem(Item i) {
    	boolean notFound = true;
    	for(HashMap.Entry<Item, Integer> item : itemList.entrySet()) {
    		if(item.getKey().equals(i)) {
    			itemList.replace(item.getKey(), item.getValue()+1);
    			notFound = false;
    			break;
    		}
    	}
    	if(notFound) itemList.put(i, 1);
    }

    public String toString() {
    	String str = "Inventory POC\n";
    	for(HashMap.Entry<Item, Integer> item : itemList.entrySet()) {
    		str+=("[" + item.getKey() + "] | [Quantity : " + item.getValue() + "]\n");
    	}
    	return str;
    }
}
