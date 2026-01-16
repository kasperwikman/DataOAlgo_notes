public class Shirt extends Clothing{
    public Shirt(int condition) {
        super(condition);
    }

    void mend() {
        super.condition = 90;
    }
}
