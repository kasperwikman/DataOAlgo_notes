import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // new CCRandomRundown();

        Utils.hello();

        //System.exit(0);


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

    }
}