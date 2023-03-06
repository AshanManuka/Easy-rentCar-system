package lk.spring.easyCar.controller;

import lk.spring.easyCar.dto.ReservationReqDTO;
import lk.spring.easyCar.service.ReservationRequest;
import lk.spring.easyCar.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/reservationReq")
public class ReservationRequestController {

    @Autowired
    ReservationRequest service;

    @PostMapping
    public ResponseUtil saveRequest(@RequestBody ReservationReqDTO dto){
        service.saveRequest(dto);
        return new ResponseUtil("200",dto.getId()+ " Added.!",null);
    }

    @GetMapping
    public ResponseUtil getAllRequests(){
        ArrayList<ReservationReqDTO> allRequests = service.getAllRequest();
        return new ResponseUtil("200"," Success.!",allRequests);
    }
}
