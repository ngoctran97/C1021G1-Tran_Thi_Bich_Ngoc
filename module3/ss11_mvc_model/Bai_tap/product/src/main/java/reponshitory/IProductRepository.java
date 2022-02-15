package reponshitory;

import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductRepository {
    List<Product> findAll() throws SQLException;

    void save(Product product);

    Product findAllId(int id);

    void update(int id, Product product);

    void remove(int id);

    List<Product> searchByName(String name);
}
