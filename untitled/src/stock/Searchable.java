package stock;

import java.util.List;

public interface Searchable {
    List<Product> bySearchable(String byName);
}
