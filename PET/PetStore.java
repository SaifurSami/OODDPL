package PET;

// Interface for managing pets in a store
interface PetStore {
    void addPet(Pet pet);

    void listPets();

    void sellPet(String name);
}
