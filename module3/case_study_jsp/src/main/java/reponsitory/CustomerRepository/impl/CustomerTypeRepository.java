package reponsitory.CustomerRepository.impl;

import model.CustomerType;
import reponsitory.BaseRepository;
import reponsitory.CustomerRepository.ICustomerTypeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepository implements ICustomerTypeRepository {

    @Override
    public List<CustomerType> findAll() {
        Connection connection = BaseRepository.getConnection();
        List<CustomerType> customerTypeList = new ArrayList<>();
        ResultSet resultSet ;
        PreparedStatement preparedStatement;
        if(connection != null){
            try {
                preparedStatement = connection.prepareStatement("select  * from customer_type");
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()){
                    int customerTypeId = resultSet.getInt("customer_type_id");
                    String customerTypeName = resultSet.getString("customer_type_name");
                    customerTypeList.add(new CustomerType(customerTypeId,customerTypeName));
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
        return customerTypeList;
    }
}
