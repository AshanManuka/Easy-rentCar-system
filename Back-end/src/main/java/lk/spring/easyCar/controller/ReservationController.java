package lk.spring.easyCar.controller;

import lk.spring.easyCar.dto.ReservationDTO;
import lk.spring.easyCar.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/reservation")
public class ReservationController {


    @PostMapping
    public ResponseUtil makeReservation(@ModelAttribute ReservationDTO dto){
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
        return null;
    }

    //set more methods to assign for Actions

}
