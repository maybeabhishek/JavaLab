package DA1.root.src;

public class DeluxeBurger extends Burger {

	public DeluxeBurger() {
		super("Deluxe Burger", "Deluxe huge burger");
		
	}

	public void addAdditions(boolean chips, boolean drinks) {
		System.out.println("Additional additions you added: ");
		if(chips == true){
			additions.add(chips);
			System.out.println("CHIPS");
		}
		if(drinks == true){
			additions.add(drinks);
			System.out.println("DRINKS");
		}
	}

	@Override
	public String calculatePrice() {

		return super.calculatePrice();
	}

	@Override
	public void additionalPrice() {
		super.additionalPrice();
	}

	@Override
	public double getBase_price() {
		return super.getBase_price();
	}
	
	
}
