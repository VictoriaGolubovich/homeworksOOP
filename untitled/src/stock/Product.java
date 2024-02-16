package stock;

public class Product implements ProductManager{
    private String name;
    private ProductManufacturer country;
    private int quantity;
    private int price;

    public Product(String name, ProductManufacturer country, int quantity, int price) {
        this.name = name;
        this.country = country;
        this.quantity = quantity;
        this.price = price;
    }

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "\nProduct{" +
                "name='" + name + '\'' +
                ", country=" + country +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public ProductManufacturer getCountry() {
        return country;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void decreaseQuantity(int amount) {
        quantity-=amount;
    }

    @Override
    public void increaseQuantity(int amount) {
        quantity+=amount;
    }
}
