package lk.spring.easyCar.controller;

import lk.spring.easyCar.dto.PaymentDTO;
import lk.spring.easyCar.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/payment")
public class PaymentController {

    @PostMapping
    public ResponseUtil makePayment(@ModelAttribute PaymentDTO dto){
        return null;
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deletePayment(String id){
        return null;
    }

    @PutMapping
    public ResponseUtil updatePayment(){
        return null;
    }

    @GetMapping
    public ResponseUtil getAllPayment(){
        return null;
    }
}
