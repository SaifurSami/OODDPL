package PetManagement;

public class Cat extends Pet {
    public Cat(String n, int a, String c) {
        super(n, a, c);
    }
    @Override
    public String getType() {
        return "Cat_Type";
    }
    
}
