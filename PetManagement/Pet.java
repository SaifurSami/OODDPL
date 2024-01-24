package PetManagement;

public class Pet {
    private String name;
    private int age;
    private String color;

    public Pet(String n, int a, String c) {
        this.name = n;
        this.age = a;
        this.color = c;
    }
    // Getter methods
    // public String getName() {
    //     return name;
    // }

    // public int getAge() {
    //     return age;
    // }

    // public String getColour() {
    //     return color;
    // }

    public String getType() {
        return "Animal";
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", color: " + color + ", Type: " + getType();
    }


}
