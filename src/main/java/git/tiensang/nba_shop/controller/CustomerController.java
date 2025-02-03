package git.tiensang.nba_shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import git.tiensang.nba_shop.models.Customer;
import git.tiensang.nba_shop.services.CustomerService;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // API lay tat ca Customer
    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
}
