package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll(); // return all customers list

    void save(Customer customer); // save a customer

    Customer findById(int id); //return a customer finded by id

    void update(int id, Customer customer); // update information of a customer

    void remove(int id); // remove a customer from a list
}
