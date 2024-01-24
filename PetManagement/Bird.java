package PetManagement;

public class Bird extends Pet {
    public Bird(String n, int a, String c) {
        super(n, a, c);
    }
    @Override
    public String getType() {
        return "Bird_Type";
    }
}
