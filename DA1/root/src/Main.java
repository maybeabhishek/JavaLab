package DA1.root.src;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Burger myBurger = new Burger("Chicken burger", "White seasame bread");
		myBurger.addAdditions(true, true, false, false);
		System.out.println(myBurger.calculatePrice());
		myBurger.additionalPrice();
		System.out.println("\n\n\n----------------Next Order-----------------------\n\n");
		
		HealthyBurger newBurger = new HealthyBurger();
		newBurger.addAdditions(true, true, false, true, false, true);
		System.out.println(newBurger.calculatePrice());
		newBurger.additionalPrice();
		System.out.println("\n\n\n----------------Next Order-----------------------\n\n");
		
		DeluxeBurger lastBurger = new DeluxeBurger();
		lastBurger.addAdditions(false, true);
		System.out.println(lastBurger.calculatePrice());
		lastBurger.additionalPrice();
	}

}