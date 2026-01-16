public class Clothing {

    public Clothing() {

    }

    public String brand;
    public String color;
    public int price;

    public Clothing(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }


    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {

            this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

