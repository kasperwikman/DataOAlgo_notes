import java.util.HashMap;

public class Bike extends Vehicle implements Shoppable {

    private int stock = 0;

    private HashMap<String, String> specs = new HashMap<>();

    public Bike(String name) {
        super(name, "pedaled vehicle");
    }
    public Bike(String name, double price) {
        super(name, "pedaled vehicle");
        setPrice(price);
    }

    public void addSpec(String key, String value){
        specs.put(key, value);
    }

    public String getSpecsString(){
        String ret = "";
        // for-each loop
        for(String key: specs.keySet()){
            ret += String.format("%s:%s\n",
                    key,
                    specs.get(key)
            );
        }
        return ret;
    }

    @Override
    public String soundWarning() {
        return "jingle";
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void setStock(int stock) {
        this.stock = stock;
    }


}
