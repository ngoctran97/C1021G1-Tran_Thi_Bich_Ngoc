package service.CustomerService.impl;

import model.Customer;
import reponsitory.CustomerRepository.impl.CustomerRepository;
import reponsitory.CustomerRepository.ICustomerRepository;
import service.CustomerService.ICustomerService;

import java.sql.SQLException;
import java.util.List;

public class CustomerService implements ICustomerService {

    private static ICustomerRepository iCustomerRepository = new CustomerRepository();
    @Override
    public List<Customer> findAll()  {
        List<Customer> customerList = iCustomerRepository.findAll();
        if(customerList.size()==0) {
            return null;
        }
        return iCustomerRepository.findAll();
    }

    @Override
    public void create(Customer customer) {
iCustomerRepository.create(customer);
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
iCustomerRepository.remove(id);
    }

    @Override
    public List<Customer> searchByName(String name) {
        return null;
    }
}
