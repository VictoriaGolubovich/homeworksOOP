package stock;

public class Picture extends Product{
    private String author;
    private String namePicture;

    public Picture(String name, ProductManufacturer country, int amount, int price, String author, String namePicture) {
        super(name, country, amount, price);
        this.author = author;
        this.namePicture = namePicture;
    }

}
