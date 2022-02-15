package service;

import model.Product;
import reponshitory.IProductRepository;
import reponshitory.ProductRepository;
import reponshitory.ProductRepository;

import java.sql.SQLException;
import java.util.List;

public class ProductService implements IProductService{

    private static IProductRepository iProductRepository = new ProductRepository();
    @Override
    public List<Product> findAll() throws SQLException {
    List<Product> productList = iProductRepository.findAll();
    if(productList.size()==0){
        return null;
        }
        return iProductRepository.findAll();
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);

    }

    @Override
    public Product findAllId(int id) {
        return iProductRepository.findAllId(id);
    }

    @Override
    public void update(int id, Product product) {
        iProductRepository.update(id,product);

    }

    @Override
    public void remove(int id) {
        iProductRepository.remove(id);

    }

    @Override
    public List<Product> searchByName(String name) {
        return iProductRepository.searchByName(name);
    }
}
