package lk.spring.easyCar.controller;

import lk.spring.easyCar.dto.CustomerDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping
    public String saveCustomer(String name){
       return null;
    }

    @GetMapping
    public ArrayList<CustomerDTO> getAllCustomer(){
        return null;
    }

    @GetMapping
    public CustomerDTO searchCustomer(){
        return null;
    }

}
