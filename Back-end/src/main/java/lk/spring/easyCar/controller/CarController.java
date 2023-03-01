package lk.spring.easyCar.controller;

import lk.spring.easyCar.dto.CarDTO;
import lk.spring.easyCar.service.VehicleService;
import lk.spring.easyCar.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/car")
public class CarController {

    @Autowired
   private VehicleService vehicleService;


    @PostMapping
    public ResponseUtil saveCar(@RequestBody CarDTO dto){
        vehicleService.saveVehicle(dto);
        return new ResponseUtil("200",dto.getRegNo()+ " Added.!",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteCar(String id){
        return null;
    }

    @PutMapping
    public ResponseUtil updateCar(@RequestBody CarDTO dto){
        vehicleService.updateVehicle(dto);
        return new ResponseUtil("200",dto.getRegNo()+ " Updated.!",null);
    }

    @GetMapping
    public ResponseUtil getAllCar(){
        ArrayList<CarDTO> allCars = vehicleService.getAllVehicle();
        return new ResponseUtil("200"," Success.!",allCars);
    }

    //set more methods to assign for filters

}
