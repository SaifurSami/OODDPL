package PetManagement;

import java.util.ArrayList;
import java.util.List;

public class ManagementSystem {
    private List<Pet> pets;

    public ManagementSystem() {
        pets = new ArrayList<>();
    }
    // Method to add a pet to the system
    public void addPet(Pet pet) {
        pets.add(pet);
    }
    // Method to remove a pet 
    public void removePet(Pet pet) {
        pets.remove(pet);
    }

    public void displayPets() {
        for(Pet pet:pets) 
            System.out.println(pet);
    }

}
