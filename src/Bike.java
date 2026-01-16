public class Bike extends Vehicle {
    public Bike(String name) {
        super(name, "pedaled vehicle");
    }

    @Override
    public String soundWarning() {
        return "jingle";
    }
}
