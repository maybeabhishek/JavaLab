package DA1.root.src;

abstract class Food{
    public abstract void addAdditions(boolean lettuce, boolean tomato, boolean carrot, boolean ham);
    public abstract String calculatePrice();
    public abstract void additionalPrice();
    public abstract double getBase_price();
    public abstract void setBase_price(double base_price);
    public abstract double getFinal_price();

}