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
    private PendingCustomerService pendingService;

    @PostMapping
    public ResponseUtil saveCustomer(@ModelAttribute PendingCustomerDTO dto){
        System.out.println(dto);
        pendingService.savePendingCustomer(dto);
        return new ResponseUtil("200",dto.getId()+ " Added.!",null);
    }


}
