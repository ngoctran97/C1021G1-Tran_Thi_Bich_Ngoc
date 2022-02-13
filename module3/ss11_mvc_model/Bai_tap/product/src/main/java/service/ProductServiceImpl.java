package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{

    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1, new Product(1,"Samsum 5.1",500,"Korea","samsum"));
        products.put(2, new Product(2,"Nokia 6",500,"Japan","Nokia"));
        products.put(3, new Product(3,"Iphone 13",1000,"Amerika","Apple"));
        products.put(4, new Product(4,"Galashi",500,"korea","samsum"));
        products.put(5, new Product(5,"Iphone 15",1500,"Amerika","Apple"));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);

    }

    @Override
    public Product findAllId(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);

    }

    @Override
    public void search(String name) {
        List<Product> productList = new ArrayList<>(products.values());
        for (Product product : productList){
            if (name.equals((product.getName())));
        }

    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> products = this.findAll();
        List<Product> productResult = new ArrayList<>();
        String productName;
        name = name.toLowerCase();
        for (Product product:products) {
            productName = product.getName().toLowerCase();
            if (productName.contains(name)){
                productResult.add(product);
            }
        }
        return productResult;
    }
}
