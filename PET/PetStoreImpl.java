package PET;
import java.util.ArrayList;

// Concrete implementation of the pet store
class PetStoreImpl implements PetStore {
    private ArrayList<Pet> pets;

    public PetStoreImpl() {
        pets = new ArrayList<>();
    }

    @Override
    public void addPet(Pet pet) {
        pets.add(pet);
        System.out.println("Added " + pet.getType() + " named " + pet.getName() + " to the store.");
    }

    @Override
    public void listPets() {
        int size = pets.size();
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }

    @Override
    public void sellPet(String name) {
        for (Pet pet : pets) {
            if (!pet.isSold() && pet.getName().equalsIgnoreCase(name)) {
                pet.sell();
                System.out.println("Sold " + pet.getType() + " named " + pet.getName() + " for $" + pet.getPrice());
                return;
            }
        }
        System.out.println("Pet not found or already sold.");
    }
}