package com.tanay.cms.service;

import com.tanay.cms.dao.CustomerDao;
import com.tanay.cms.exception.CustomerNotFound;
import com.tanay.cms.model.Customer;
//import org.hibernate.annotations.NaturalId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import java.util.Iterator;
import java.util.List;
import java.util.Optional;

//import java.util.concurrent.CopyOnWriteArrayList;
@Component
public class customerService {
//    List<Customer> customerList = new CopyOnWriteArrayList<>();
    // CopyWriteArrayList is a List that works in parallel system

    @Autowired
    private CustomerDao customerdao;
//    int currCustomerId = 1;
    public Customer addCustomer(Customer customer){
//        customer.setCustomerId(currCustomerId);
//        currCustomerId++;
//        customerList.add(customer);
//        return customer;
        return customerdao.save(customer);
    }
    public void deleteCustomer(int customerId){
//        customerList
//                .forEach(c -> {
//                    if(c.getCustomerId()==customerId){
//                        customerList.remove(c);
//                    }
//                });
        customerdao.deleteById(customerId);
    }
    public Customer updateCustomer(int id,Customer customer){
//        customerList
//                .stream()
//                .forEach(c -> {
//                    if(c.getCustomerId()==id){
//                        c.setCustomerFirstName(customer.getCustomerFirstName());
//                        c.setCustomerSecondName(customer.getCustomerSecondName());
//                        c.setCustomerEmail(customer.getCustomerEmail());
//                    }
//                });
//        return customerList
//                .stream()
//                .filter(c -> c.getCustomerId() == id)
//                .findFirst()
//                .get();
        // for updation we have to set the customer Id of the object that has to be updated
        customer.setCustomerId(id);
        return customerdao.save(customer);
    }
    public List<Customer> getCustomers(){
//        return customerList;
        return customerdao.findAll();
    }
    public Customer getCustomer(int id){
//        return customerList
//                .stream()
//                .filter(c -> c.getCustomerId()==id)
//                .findFirst()
//                .get();

        Optional<Customer> optionalcustomer = customerdao.findById(id);
        if(!optionalcustomer.isPresent())
            throw new CustomerNotFound("the customer is not available");
        return optionalcustomer.get();
    }
}
