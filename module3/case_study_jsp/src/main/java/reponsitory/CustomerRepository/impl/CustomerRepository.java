package reponsitory.CustomerRepository.impl;

import model.Customer;
import model.CustomerType;
import reponsitory.BaseRepository;
import reponsitory.CustomerRepository.ICustomerRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Customer> findAll()  {
        Connection connection = BaseRepository.getConnection();
        List<Customer> customerList = new ArrayList<>();
        ResultSet resultSet;
        PreparedStatement preparedStatement;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement("SELECT * FROM casestudy_jsp.customer ctm join customer_type ct on ctm.customer_type_id = ct.customer_type_id");
                resultSet = preparedStatement.executeQuery();
                Customer customer;
                while (resultSet.next()) {
                    customer = new Customer();
                    customer.setCustomerID(resultSet.getInt("customer_id"));
                    customer.setCustomerCode(resultSet.getString("customer_code"));
                    customer.setCustomerName(resultSet.getString("customer_name"));
                    customer.setCustomerBirthday(resultSet.getString("customer_birthday"));
                    customer.setCustomerGender(resultSet.getBoolean("customer_gender"));
                    customer.setCustomerIdCard(resultSet.getString("customer_id_card"));
                    customer.setCustomerPhone(resultSet.getString("customer_phone"));
                    customer.setCustomerEmail(resultSet.getString("customer_email"));
                    customer.setCustomerAddress(resultSet.getString("customer_address"));
                    customer.setCustomerTypeName(resultSet.getString("customer_type_name"));
                    customerList.add(customer);


                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return customerList;

    }

    @Override
    public void create(Customer customer) {
        Connection connection = BaseRepository.getConnection();
        PreparedStatement preparedStatement;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement("insert into customer(customer_code," +
                        "customer_name," +
                        "customer_birthday," +
                        "customer_gender," +
                        "customer_id_card," +
                        "customer_phone," +
                        "customer_email," +
                        "customer_address," +
                        "customer_type_id) value (?,?,?,?,?,?,?,?,?)");
                preparedStatement.setString(1, customer.getCustomerCode());
                preparedStatement.setString(2, customer.getCustomerName());
                preparedStatement.setString(3, customer.getCustomerBirthday());
                preparedStatement.setBoolean(4, customer.isCustomerGender());
                preparedStatement.setString(5, customer.getCustomerIdCard());
                preparedStatement.setString(6, customer.getCustomerPhone());
                preparedStatement.setString(7, customer.getCustomerEmail());
                preparedStatement.setString(8, customer.getCustomerAddress());
                preparedStatement.setInt(9, customer.getCustomerTypeId());

                preparedStatement.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    @Override
    public Customer findAllId(int id) {
        return null;
    }

    @Override
    public void update(int id, Customer customer) {


    }

    @Override
    public void remove(int id) {

    }

    @Override
    public List<Customer> searchByName(String name) {
        return null;
    }

    @Override
    public List<CustomerType> selectCustomerType() {
        List<CustomerType> customerTypeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().
                    prepareStatement("select * from customer_type");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                customerTypeList.add(new CustomerType(resultSet.getInt("customer_type_id"), resultSet.getString("customer_type_name")));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerTypeList;
    }
}
