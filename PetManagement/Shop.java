package PetManagement;

public class Shop {
    public static void main(String args[]) {
        ManagementSystem managementSystem = new ManagementSystem();
        Pet dog = new Dog("Tom", 10, "Black");
        Pet cat = new Cat("Jerry", 5, "Brown");
        Pet bird = new Bird("Egal", 4, "Black");
        // Add pets to the system.
        managementSystem.addPet(dog);
        managementSystem.addPet(cat);
        managementSystem.addPet(bird);
        //managementSystem.removePet(bird);
        //managementSystem.removePet(dog);
        managementSystem.displayPets();
    }
}
