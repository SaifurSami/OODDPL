package PET;

class Parrot extends Pet {
    public Parrot(String name, double price) {
        super(name, price);
    }

    @Override
    public String getType() {
        return "Parrot";
    }
}