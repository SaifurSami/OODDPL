package PET;
// Abstract class for all pets
abstract class Pet {
    private String name;
    private double price;
    private boolean sold;

    public Pet(String name, double price) {
        this.name = name;
        this.price = price;
        this.sold = false;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isSold() {
        return sold;
    }

    public void sell() {
        sold = true;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Price: $" + price + ", Sold: " + (sold ? "Yes" : "No");
    }

    // Abstract method to get the type of pet
    public abstract String getType();
}










