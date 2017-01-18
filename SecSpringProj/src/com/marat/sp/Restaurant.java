package com.marat.sp;

public class Restaurant {
	
/*	String welcomeNote;
	public void greetCustomer() {
		System.out.println(welcomeNote);
	}
	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}*/
	
	IHotDrink hotDrink;
	
	Restaurant(IHotDrink hotDrink){
		this.hotDrink = hotDrink;
	}
	
	public void prepareHotDrinking() {
		hotDrink.prepareHotDrink();
		System.out.println("Customer has drinking...");
	}
	
}
