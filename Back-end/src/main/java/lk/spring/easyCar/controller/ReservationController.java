package lk.spring.easyCar.controller;

import lk.spring.easyCar.dto.PendingCustomerDTO;
import lk.spring.easyCar.dto.ReservationDetailsDTO;
import lk.spring.easyCar.service.ReservationService;
import lk.spring.easyCar.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    ReservationService service;

    @PostMapping
    public ResponseUtil makeReservation(@RequestBody ReservationDetailsDTO dto){
        return null;
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteReservation(String id){
        return null;
    }

    @PutMapping
    public ResponseUtil updateReservation(){
        return null;
    }

    @GetMapping
    public ResponseUtil getAllReservation(){
        ArrayList<ReservationDetailsDTO> allReservations = service.getAllReservation();
        return new ResponseUtil("200"," Success.!",allReservations);
    }

    //set more methods to assign for Actions

}
