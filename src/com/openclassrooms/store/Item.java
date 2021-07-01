package com.openclassrooms.store;

public abstract class Item {
    public Brand brand;
    public double price;
    
    Item(Brand brand, double price){
    	this.brand = brand;
    	this.price = price;
    }
    
    public String toString() {
    	return "Brand : " + brand + ", Price : " +price;
    }

    @Override
    public boolean equals(Object obj) {
    	if(obj instanceof Item) return this.brand.equals(((Item)obj).brand) && 
    							this.price == ((Item)obj).price;
    	else return false;
    }
}
