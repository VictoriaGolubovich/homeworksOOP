package stock;

public class Order{
    private String name;
    private int amount;

    public Order(String name, int amount) {
        this.amount = amount;
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }
    public String getProd() {
        return name;
    }
}
