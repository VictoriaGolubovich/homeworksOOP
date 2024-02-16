package stock;

public class ProductManufacturer implements Manufacturer {
    private String country;

    @Override
    public String getManufacturer() {
        return country;
    }

    @Override
    public String toString() {
        return country;
    }

    public ProductManufacturer(String country) {
        this.country = country;
    }
}
