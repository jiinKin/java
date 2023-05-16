package com.min.edu.ctrl;

import com.min.edu.H2OImpl;
import com.min.edu.sub.Ice;
import com.min.edu.sub.Steam;
import com.min.edu.sub.Water;

public class ChoiceFactory {
	
	private static ChoiceFactory factory;
	
	public static int factoryCount =0;
	
	private ChoiceFactory() {
		factoryCount++;
	}
	
	public static ChoiceFactory getInstance() {
		if(factory == null) {
			factory = new ChoiceFactory();
		}
		return factory;
	}
	
	
	
	public  H2OImpl factory(int choice) {
		H2OImpl obj = null;
		
		switch (choice) {
		case 1:
			obj = new Ice();
			break;
		case 2:
			obj = new Water();
			break;
		case 3:
			obj = new Steam();
			break;

		}
		
		return obj;
	}
	
}






