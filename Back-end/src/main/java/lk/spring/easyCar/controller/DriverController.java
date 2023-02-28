package lk.spring.easyCar.controller;

import lk.spring.easyCar.dto.DriverDTO;
import lk.spring.easyCar.dto.PendingCustomerDTO;
import lk.spring.easyCar.entity.Driver;
import lk.spring.easyCar.entity.User;
import lk.spring.easyCar.repo.DriverRepo;
import lk.spring.easyCar.service.DriverService;
import lk.spring.easyCar.service.PendingCustomerService;
import lk.spring.easyCar.util.ResponseUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    private DriverService service;

    @PostMapping
    public ResponseUtil saveDriver(@RequestBody DriverDTO dto){
        service.saveDriver(dto);
        return new ResponseUtil("200",dto.getId()+ " Added.!",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteDriver(String id){
        return null;
    }

    @PutMapping
    public ResponseUtil updateDriver(@RequestBody DriverDTO dto){
       service.updateDriver(dto);
       return new ResponseUtil("200",dto.getId()+ " Updated.!",null);
    }

    @GetMapping
    public ResponseUtil getAllDriver(){
        ArrayList<DriverDTO> allDrivers = service.getAllDriver();
        return new ResponseUtil("200"," Success.!",allDrivers);
    }

    @GetMapping(path = "/{name}")
    public ResponseUtil getSelectedDriver(@PathVariable String name){
        DriverDTO driver = service.getSelectedDriver(name);
        return new ResponseUtil("200"," Success.!",driver);
    }
}
