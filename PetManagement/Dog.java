package PetManagement;

class Dog extends Pet {
    public Dog(String n, int a, String c) {
        super(n, a, c);
    }
    @Override 
    public String getType() {
        return "Dog_Type";
    }
}
