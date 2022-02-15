package reponshitory;

import model.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository implements IProductRepository {
    private BaseRipository baseRipository = new BaseRipository();


//    private static final String INSERT_PRODUCT_SQL = "INSERT INTO users (name, email, country) VALUES (?, ?, ?);";
//    private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
//    private static final String SELECT_ALL_USERS = "select * from users";
//    private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
//    private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?;";





    @Override
    public List<Product> findAll() throws SQLException {
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRipository.getConnection().
                    prepareStatement("select * from product");
            ResultSet resultSet = preparedStatement.executeQuery();
            Product product;

            while (resultSet.next()){
                product = new Product();
                product.setId(resultSet.getInt("id"));
                product.setName(resultSet.getString("name"));
                product.setPrice(resultSet.getDouble("price"));
                product.setDescription(resultSet.getString("description"));
                product.setProducer(resultSet.getString("producer"));
                list.add(product);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void save(Product product) {
        try {
            PreparedStatement preparedStatement = this.baseRipository.getConnection().
                    prepareStatement("insert into product(id, name, price,description, producer) value (?,?,?,?,?)");
            preparedStatement.setInt(1,product.getId());
            preparedStatement.setString(2,product.getName());
            preparedStatement.setDouble(3,product.getPrice());
            preparedStatement.setString(4,product.getDescription());
            preparedStatement.setString(4,product.getProducer());
            int row = preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public Product findAllId(int id) {
//        return products.get(id);
        return null;
    }

    @Override
    public void update(int id, Product product) {

//        products.put(id,product);
    }

    @Override
    public void remove(int id) {
//        products.remove(id);

    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> products = null;
        try {
            products = this.findAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
