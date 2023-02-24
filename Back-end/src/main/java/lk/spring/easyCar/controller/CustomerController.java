package lk.spring.easyCar.controller;

import lk.spring.easyCar.dto.UserDTO;
import lk.spring.easyCar.service.CustomerService;
import lk.spring.easyCar.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {


    @PostMapping
    public ResponseUtil saveCustomer(@ModelAttribute UserDTO dto){
//        service.saveCustomer(dto);
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
