package PET;

// Concrete subclasses for specific pet types
class Cat extends Pet {
    public Cat(String name, double price) {
        super(name, price);
    }

    @Override
    public String getType() {
        return "Cat";
    }
}
