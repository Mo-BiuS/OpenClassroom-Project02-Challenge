package com.openclassrooms.store;

public class Mouse extends Item {
	
    public Mouse(Brand brand, double price) {
        super(brand, price);
    }
    
    public String toString() {
    	return "Mouse | " + super.toString();
    }
}
