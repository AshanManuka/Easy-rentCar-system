package lk.spring.easyCar.controller;

import lk.spring.easyCar.repo.DriverRepo;
import lk.spring.easyCar.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    DriverRepo repo;

    @PostMapping
    public ResponseUtil saveDriver(@RequestBody DriverDTO dto){
        Driver driver = new Driver(dto.getNic(),dto.getName(),dto.getAddress());
        System.out.println(driver);
        repo.save(driver);
        return new ResponseUtil("200",dto.getName()+ " Added.!",null);
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
