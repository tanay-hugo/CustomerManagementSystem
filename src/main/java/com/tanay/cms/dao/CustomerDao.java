package com.tanay.cms.dao;

import com.tanay.cms.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.List;

// DAO  -> DATA ACCESS OBJECT
@Repository
public interface CustomerDao extends CrudRepository<Customer,Integer> {
    @Override
    List<Customer> findAll();
}
