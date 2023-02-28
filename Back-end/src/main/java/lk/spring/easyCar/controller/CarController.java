package lk.spring.easyCar.controller;

import lk.spring.easyCar.dto.CarDTO;
import lk.spring.easyCar.service.VehicleService;
import lk.spring.easyCar.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/car")
public class CarController {

    @Autowired
   private VehicleService vehicleService;


    @PostMapping
    public ResponseUtil saveCar(@RequestBody CarDTO dto){
        System.out.println(dto);
        vehicleService.saveVehicle(dto);
        return new ResponseUtil("200",dto.getRegNo()+ " Added.!",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteCar(String id){
        return null;
    }

    @PutMapping
    public ResponseUtil updateCar(){
        return null;
    }

    @GetMapping
    public ResponseUtil getAllCar(){
        return null;
    }

    //set more methods to assign for filters

}
