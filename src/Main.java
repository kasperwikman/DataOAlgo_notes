import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // CC

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int randomNum = random.nextInt(1, 100);

            System.out.printf("%d - Press enter for a new number or Q to quit", randomNum);
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("Thanks, goodbye!");
                break;
            }
        }


        System.exit(0);

        // CC ends

        Scanner textInput = new Scanner(System.in);
        /* System.out.print("Write something: ");
           String str = textInput.nextLine();
           System.out.printf("You wrote: %s\n", str); */

        BikeShop bikeShop = new BikeShop();
        bikeShop.addBike(new Bike("Helkama", 500));
        bikeShop.getBike(0).addSpec("wheel-size", "29 inches");
        bikeShop.getBike(0).addSpec("suspension", "hardtail");

        bikeShop.addBike(new Bike("Scott", 200));
        bikeShop.getBike(1).addSpec("wheel-size", "24 inches");
        bikeShop.getBike(1).addSpec("suspension", "none");

        bikeShop.addBike(new Bike("Jopo", 400));
        bikeShop.getBike(2).addSpec("frame", "carbon");


        System.out.println("Welcome to the Bike Shop!\nOur bicycles:\n");


        for (int i = 0; i < bikeShop.getBikeCount(); i++) {
            Bike bike = bikeShop.getBike(i);
            System.out.printf("%d - %s %.2f Saldo: %d st\n%s\n",
                    i + 1,
                    bike.getName(),
                    bike.getPrice(),
                    bike.getStock(),
                    bike.getSpecsString()
            );
        }

        while (true) {

            // Ask for input once the list is finished
            System.out.printf("\nWhich bicycle do you want to buy? (1-%d, or q to quit): ",
                    bikeShop.getBikeCount());

            String bikeInput = textInput.nextLine();

            if (bikeInput.equalsIgnoreCase("q")) {
                System.out.println("Thank you for visiting!");
                System.exit(0);
            }

            try {
                int chosenBike = Integer.parseInt(bikeInput) - 1;
                Bike bikeOwned = bikeShop.getBike(chosenBike);
                System.out.printf("Congratulations, you now own a %s!\n", bikeOwned.getName());
                break;
            } catch (NumberFormatException e) {
                System.out.println("You must input a valid integer!");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("That bike number doesn't exist!");
            } catch (Exception e) {
                System.out.println("Something went wrong. " + e.getMessage());
            }

        /*
        System.exit(0);

        Car car = new Car("Renault", 12000);
        Car car2 = new Car("BMW", 10000);
        Car car3 = new Car("Volvo", 30000);

        car.refuel(50);
        car2.refuel(100);

        System.out.printf("%s %s\n",
                car.getName(),
                car.getFuelInfo());
        System.out.printf("%s fuel %d (total fuel: %d)", car2.getName(), car2.getFuel(), car2.getTotalFuel());

        Vehicle bike = new Bike("Helkama"); */

        }
    }
}

