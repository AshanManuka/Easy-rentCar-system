package lk.spring.easyCar.controller;

import lk.spring.easyCar.dto.VehicleDTO;
import lk.spring.easyCar.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/car")
public class CarController {

    @PostMapping
    public ResponseUtil saveCar(@ModelAttribute VehicleDTO dto){
        return null;
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
