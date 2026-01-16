public class Main {
    public static void main(String[] args) {

        Shirt shirt1 = new Shirt("Nike", "Blue", 40);
        Shirt shirt2 = new Shirt("Adidas", "Red", 30);

        System.out.println("We have 2 shirts, a " + shirt1.getColor() + " "
                + shirt1.getBrand() + " shirt that costs " + shirt1.getPrice() + " euros. and a " + shirt2.getColor() + " " +
                shirt2.getBrand() + " shirt that costs " + shirt2.getPrice() + " euros.");

    }

}
