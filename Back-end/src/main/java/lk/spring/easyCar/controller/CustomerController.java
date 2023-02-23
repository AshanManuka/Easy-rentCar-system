package lk.spring.easyCar.controller;

import lk.spring.easyCar.dto.CustomerDTO;
import lk.spring.easyCar.entity.Customer;
import lk.spring.easyCar.repo.CustomerRepo;
import lk.spring.easyCar.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerRepo repo;

    @PostMapping
    public ResponseUtil saveCustomer(@ModelAttribute CustomerDTO dto){
       Customer customer = new Customer(dto.getRegisterId(),dto.getEmail(),dto.getName(),dto.getContact(),dto.getDocId(),dto.getPassword());
        repo.save(customer);
        return null;
    }

    @GetMapping
    public ResponseUtil getAllCustomer(){
        return null;
    }

    @GetMapping(params = "id")
    public ResponseUtil searchCustomer(){
        return null;
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteCustomer(String id){
        return null;
    }

    @PutMapping
    public ResponseUtil updateCustomer(){
        return null;
    }

}
