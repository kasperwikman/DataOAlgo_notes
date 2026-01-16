public class Main {
    public static void main(String[] args) {

        Shirt shirt = new Shirt(50);
        Hat hat = new Hat(20);

        System.out.printf("The shirt's condition: %d\n", shirt.getCondition());
        shirt.mend();
        hat.mend();
        System.out.printf("The shirt's condition: %d\n", shirt.getCondition());

        Vehicle car = new Car("Renault", 12000);
        Car car2 = new Car("BMW");
        Vehicle bike = new Bike("Helkama");
        Vehicle todaysVehicle;

        // Cannot be done if superclass is absract --> Vehicle boat = new Vehicle("Buster", "boat");

        car.setPrice(10000.0);
        System.out.printf("%s costs %.2f €\n",
                car.getName(),
                car.getPrice()
        );



        todaysVehicle = car;

        System.out.printf("Today I'm using %s\n", todaysVehicle.getName());

        todaysVehicle = bike;

        System.out.printf("Today I'm using %s\n", todaysVehicle.getName());

        // Overload
        car2.refuel();
        car2.refuel(50);

        System.out.println(car.getName() + " is a " + car.getVehicleType());
        System.out.println(bike.getName() + " is a " + bike.getVehicleType());

        System.out.println(car.getName() + " says " + car.soundWarning() + " and " + bike.getName() + " says " + bike.soundWarning());

    }
}
