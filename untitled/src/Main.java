import stock.*;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
//        System.out.println("stock.bySearchable(\"Ваза\") = " + stock.bySearchable("Ваза"));
        stock.addProduct(new Picture("Картина1",
                new ProductManufacturer("Россия"),
                1,
                365,
                "И. Шишкин",
                "Утро в сосновом лесу"));
        stock.addProduct(new Picture("Картина2",
                new ProductManufacturer("Италия"),
                1,
                617,
                "Сандро Ботичелли",
                "Рождение Венеры"));
        System.out.println(stock.getProduct());
        System.out.println();
        Order order = new Order("Статуэтка", 4);
        System.out.println("Заказ: " + order.getProd() + ", " + order.getAmount() + " штук");
        stock.processOrder(order);
        Order order1 = new Order("Ваза", 3);
        System.out.println("Заказ: " + order1.getProd() + ", " + order1.getAmount() + " штук");
        stock.processOrder(order1);
        System.out.println();
        System.out.println(stock.getProduct());
    }
}