package base.items;

import bases.Packing;

public interface Item {
	
	public String name();
	
	public Packing packing();
	
	public float price();
 
}

