package lk.spring.easyCar.controller;

import lk.spring.easyCar.dto.DriverDTO;
import lk.spring.easyCar.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/driver")
public class DriverController {

    @PostMapping
    public ResponseUtil saveDriver(@ModelAttribute DriverDTO dto){
        return null;
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteDriver(String id){
        return null;
    }

    @PutMapping
    public ResponseUtil updateDriver(){
        return null;
    }

    @GetMapping
    public ResponseUtil getAllDriver(){
        return null;
    }
}
