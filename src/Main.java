import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner textInput = new Scanner(System.in);

        BikeShop bikeShop = new BikeShop();
        bikeShop.addBike(BikeFactory.createExpensiveBike());
        bikeShop.addBike(BikeFactory.createExpensiveBike());
        bikeShop.addBike(BikeFactory.createCheapBike());
        bikeShop.addBike(BikeFactory.createCheapBike());

        Customer customer;
        Object loadedObject = FileUtils.loadObject("customer.save");
        if (loadedObject != null) {
            customer = (Customer) loadedObject;
        } else {
            customer = new Customer(1500);
        }


        System.out.printf("Welcome to Bike Shop, you have %.2f €\n", customer.getFunds());
        if (customer.getCurrentBike() != null) {
            System.out.printf("You own a %s\n", customer.getCurrentBike().getName());
        } else {
            System.out.println("You don't own a bike yet!");
        }

        System.out.println("Our bikes:");



        for (int i = 0; i < bikeShop.getBikeCount(); i++) {
            Bike bike = bikeShop.getBike(i);
            System.out.printf("%d - %s %.2f € stock: %d st\n",
                    i+1,
                    bike.getName(),
                    bike.getPrice(),
                    bike.getStock());
        }

        while (true) {
            System.out.print("Which bike do you want to buy? (1-" + bikeShop.getBikeCount() + ", or 'q' to quit): ");
            String input = textInput.nextLine();

            // Check if the user wants to exit
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Thank you, come again!");
                break;
            }

            try {
                int chosenBike = Integer.parseInt(input) - 1;

                // Check if the number is within the valid range
                if (chosenBike < 0 || chosenBike >= bikeShop.getBikeCount()) {
                    System.out.println("Bike doesn't exist!");
                } else {
                    // Success! Get the bike and congratulate the user
                    Bike selectedBike = bikeShop.getBike(chosenBike);
                    if(customer.buyBike(selectedBike)) {
                        System.out.printf("Congratulations, you own a %s!, you have %.2f € left\n",
                                customer.getCurrentBike().getName(),
                                customer.getFunds()
                        );
                        break;
                    } else {
                        System.out.printf("You cannot afford the %s (you have %.2f €)\n",
                                selectedBike.getName(),
                                customer.getFunds()
                        );
                    }

                }
            } catch (NumberFormatException e) {
                System.out.println("Ogiltig inmatning, vänligen ange en siffra eller 'q'.");
            }
        }

        FileUtils.saveObject(customer, "customer.save");


        //        int userInteger = Utils.getIntInput("Give an integer: ");
        //        System.out.printf("Thank you, you gave the integer %s\n", userInteger);

        // System.out.println("File content: " + FileUtils.readTextFile("greeting.txt"));
        // FileUtils.writeTextFile("Hello governor!", "greeting.txt");
    }
}