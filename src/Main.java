import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        BikeShop bikeShop = new BikeShop();
        bikeShop.addBike(new Bike("Helkama", 500));
        bikeShop.getBike(0).addSpec("wheel-size", "29 inches");
        bikeShop.getBike(0).addSpec("suspension", "hardtail");

        System.out.println(bikeShop.getBike(0).getSpecsString());

        bikeShop.addBike(new Bike("Scott", 200));
        bikeShop.getBike(1).addSpec("wheel-size", "24 inches");
        bikeShop.getBike(1).addSpec("suspension", "none");

        bikeShop.addBike(new Bike("Jopo", 400));
        bikeShop.getBike(2).addSpec("frame", "carbon");


        System.out.println("Welcome to the Bike Shop!\n Our bicycles:");
        for (int i = 0; i < bikeShop.getBikeCount(); i++) {

            Bike bike = bikeShop.getBike(i);

            System.out.printf(" - %s %.2f Saldo: %d\n %s\n",
                    bike.getName(),
                    bike.getPrice(),
                    bike.getStock(),
                    bike.getSpecsString()
            );

        }

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

        Vehicle bike = new Bike("Helkama");

    }
}
