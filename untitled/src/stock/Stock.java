package stock;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Searchable, Warehouse{
    private List<Product> products;

    public Stock(){
        products = fullProduct();
    }

    private List<Product> fullProduct(){
        List<Product> res = new ArrayList<>();
        res.add(new Product("Ваза",
                new ProductManufacturer("Польша"),
                3,
                67
        ));
        res.add(new Product("Скульптура",
                new ProductManufacturer("Бельгия"),
                2,
                285
        ));
        res.add(new Product("Статуэтка",
                new ProductManufacturer("Литва"),
                15,
                9
        ));
        return res;
    }
    public List<Product> processOrder(Order order) {
        for(Product product: products){
            if(product.getName().contains(order.getProd())){
                if (product.getQuantity()==order.getAmount()){
                    removeProduct(product);
                    break;
                } else if (product.getQuantity() < order.getAmount()){
                    System.out.println("Товара " + product.getName() +
                            " нет в достаточном количестве. Имеется только " +
                            product.getQuantity()+ " штук.");
                } else {
                    product.decreaseQuantity(order.getAmount());
                }
            }
        }
        return products;
    }


    @Override
    public List<Product> bySearchable(String byName) {
        List<Product> res = new ArrayList<>();
        for(Product product: products){
            if(product.getName().contains(byName)){
                res.add(product);
            }
        }
        return res;
    }
    public List<Product> getProduct(){
        return products;
    }
    @Override
    public void addProduct(Product product) {
        products.add(product);

    }

    @Override
    public void removeProduct(Product product) {
        products.remove(product);
    }


}
