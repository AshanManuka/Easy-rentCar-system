package lk.spring.easyCar.controller;

import lk.spring.easyCar.dto.UserDTO;
import lk.spring.easyCar.service.AdminService;
import lk.spring.easyCar.service.CustomerService;
import lk.spring.easyCar.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping
    public ResponseUtil saveCustomer(@ModelAttribute UserDTO dto){
//        service.saveCustomer(dto);
        return null;
    }

    @GetMapping
    public ResponseUtil getAllCustomer(){
        ArrayList<UserDTO> allCustomers = service.getAllCustomer();
        return new ResponseUtil("200"," Success.!",allCustomers);
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
