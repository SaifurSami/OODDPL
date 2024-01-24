package PET;
import java.util.Scanner;

public class PetManagementSystem {
    public static void main(String[] args) {
        PetStore petStore = new PetStoreImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the cat name: ");
        String catname = scanner.nextLine();

        System.out.print("Price: ");
        int cat_price = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the dog name: ");
        String dogname = scanner.nextLine();

        System.out.print("Price: ");
        int dog_price = scanner.nextInt();
        scanner.nextLine();


        System.out.print("Enter the parrot name: ");
        String parrotname = scanner.nextLine();
        System.out.print("Price: ");
        int parrot_price = scanner.nextInt();
        scanner.nextLine();


        // Add some pets to the store
        petStore.addPet(new Cat(catname, cat_price));

        petStore.addPet(new Dog(dogname,dog_price));

        petStore.addPet(new Parrot(parrotname,parrot_price));

        // List available pets
        petStore.listPets();

        // Sell a pet
        System.out.println("Enter the pet number to sell: ");
        String sellname = scanner.nextLine();

        petStore.sellPet(sellname);
        System.out.println("Pet lists after selling a pet");
        petStore.listPets();
    }
}