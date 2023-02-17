package lk.spring.easyCar.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping
    public String saveCustomer(String name){
        System.out.println("name : "+name);
        return "Done"+" : "+name;
    }
}
