package com.tanay.cms.api;

import com.tanay.cms.model.Customer;
import com.tanay.cms.service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value =  "/customers")
public class CustomerResource {

    @Autowired
    private customerService customerservice;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){
        return customerservice.addCustomer(customer);
    }
    @GetMapping
    public List<Customer> getCustomers(){
        return customerservice.getCustomers();
    }

    @GetMapping(value = "/{cid}")
    public Customer getCustomer(@PathVariable("cid") int cid){
        return customerservice.getCustomer(cid);
    }

    @PutMapping(value = "/{cid}")
    public Customer updateCustomer(@PathVariable("cid") int id,@RequestBody Customer customer){
        return customerservice.updateCustomer(id,customer);
    }

    @DeleteMapping(value = "/{cid}")
    public void deleteCustomer(@PathVariable("cid") int id){
        customerservice.deleteCustomer(id);
    }
}
