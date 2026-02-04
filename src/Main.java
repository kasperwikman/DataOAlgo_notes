import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("File content: " + FileUtils.readTextFile("greeting.txt"));
        FileUtils.writeTextFile("Hello governor!", "greeting.txt");


        System.exit(0);


        /*

        int userInteger = Utils.getIntInput("Give an integer: ");

        System.out.printf("Thank you, you gave the integer %s\n", userInteger);

        Scanner textInput = new Scanner(System.in);

        BikeShop bikeShop = new BikeShop();
        bikeShop.addBike(BikeFactory.createExpensiveBike());
        bikeShop.addBike(BikeFactory.createExpensiveBike());
        bikeShop.addBike(BikeFactory.createCheapBike());
        bikeShop.addBike(BikeFactory.createCheapBike());

        System.out.println("Välkommen till Bike Shop! Våra cyklar:");
        for (int i = 0; i < bikeShop.getBikeCount(); i++) {
            Bike bike = bikeShop.getBike(i);
            System.out.printf("%d - %s %.2f € lagersaldo: %d st\n",
                    i+1,
                    bike.getName(),
                    bike.getPrice(),
                    bike.getStock());
        }

        while (true) {
            // We call the utility method directly
            int chosenBike = Utils.getIntInput("Vilken cykel vill du köpa? (1-" + bikeShop.getBikeCount() + ")") - 1;

            // Check if the number is within the valid range of the list
            if (chosenBike < 0 || chosenBike >= bikeShop.getBikeCount()) {
                System.out.println("Det finns ingen sådan cykel!");
                continue;
            }


        }
*/
    }
}