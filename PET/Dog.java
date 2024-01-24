package PET;

class Dog extends Pet {
    public Dog(String name, double price) {
        super(name, price);
    }

    @Override
    public String getType() {
        return "Dog";
    }
}