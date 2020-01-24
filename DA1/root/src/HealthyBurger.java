package DA1.root.src;

public class HealthyBurger extends Burger{
	
	public HealthyBurger() {
		super("Health Burger", "Brown rye bread roll");
		
	}
	
	public void addAdditions(boolean lettuce, boolean tomato, boolean carrot, boolean ham, boolean mustard, boolean ketchup) {
		
		super.addAdditions(lettuce, tomato, carrot, ham);
		if(mustard == true){
			additions.add(mustard);
			System.out.println("MUSTARD");
		}
		if(ketchup == true){
			additions.add(ketchup);
			System.out.println("KETCHUP");
		}
		
	}
		
	@Override
	public void additionalPrice() {
		
		super.additionalPrice();
	}

	@Override
	public double getBase_price() {
		
		return super.getBase_price();
	}

	@Override
	public String calculatePrice() {
		
		return super.calculatePrice();
	}
	
	
	
}