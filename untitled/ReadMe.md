3*) Создать систему управления складом(SOLID)
     a) Product должен хранит информацию о товаре, такую как название, количество, цена и тд. (decreaseQuantity(int amount) , increaseQuantity(int amount))
     b) Warehouse должен управлять запасами товаров на складе, обеспечивает их хранение и выдачу.(добавление/удаление продукта, увеличение/уменьшение количества продукта)
     c) Order должен отвечать за обработку заказов на товары со склада. (processOrder(Product product, int amount)- обработка заказа)

1. Single responsibility principle:
- class Product (единственная ответственность - отвечает только за хранение)
2. Open-closed principle:
- class ProductManufacturer (открыт для расширения, но закрыт для изменения)
3. Liskov substitution principle: 
- class Picture (этот класс не изменяет определение типа родительского и его поведение)
4. Interface segregation principle: 
- interface ProductManager, interface Warehouse, interface Searchable(разделение интерфейсов на несколько специализированных)
5. Dependency inversion principle:
- class Order (модули высокого уровня не зависят от модулей нижнего уровня)