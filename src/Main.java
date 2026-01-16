public class Main {
    public static void main(String[] args) {

        Car car = new Car("Renault");
        Bike bike = new Bike("Helkama");

        System.out.println(car.getName() + " is a " + car.getVehicleType());
        System.out.println(bike.getName() + " is a " + bike.getVehicleType());
    }
}
