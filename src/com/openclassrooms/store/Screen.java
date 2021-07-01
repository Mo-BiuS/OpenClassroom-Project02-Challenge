package com.openclassrooms.store;

public class Screen extends Item {

    public String resolution;

    public Screen(Brand brand, double price, String resolution) {
    	super(brand,price);
    	this.resolution = resolution;
    }
    public String toString() {
    	return "Screen | " + super.toString()+", Resolution : "+resolution;
    }
    
    @Override
    public boolean equals(Object obj) {
    	if(obj instanceof Screen) return super.equals((Item)obj) && 
    									 this.resolution.equals(((Screen)obj).resolution);
    	else return false;
    }
}
