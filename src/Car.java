public class Car extends Vehicle {

    private int fuel = 0;

    // Overload
    // needed to allow multiple parameters
    public Car(String name, double price) {
        super(name, "motorized vehicle");
        super.price = price;
        super.discount = 0.9499999;
    }

    public Car(String name) {
        super(name, "motorized vehicle");
    }

    @Override
    public String soundWarning() {
        return "honk";
    }

    public void refuel(int amount) {
        fuel +=amount;
    }

    public void refuel() {
        fuel = 100;
    }

}
