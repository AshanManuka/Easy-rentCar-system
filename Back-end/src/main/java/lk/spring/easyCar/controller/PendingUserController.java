package lk.spring.easyCar.controller;

import lk.spring.easyCar.dto.PendingCustomerDTO;
import lk.spring.easyCar.service.PendingCustomerService;
import lk.spring.easyCar.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/pendingCustomer")
public class PendingUserController {

    @Autowired
    private PendingCustomerService service;

    @PostMapping
    public ResponseUtil saveCustomer(@RequestBody PendingCustomerDTO dto){
        System.out.println(dto);
        service.savePendingCustomer(dto);
        return new ResponseUtil("200",dto.getId()+ " Added.!",null);
    }


}
