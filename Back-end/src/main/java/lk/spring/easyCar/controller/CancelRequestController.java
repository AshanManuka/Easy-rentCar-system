package lk.spring.easyCar.controller;

import lk.spring.easyCar.dto.AdminDTO;
import lk.spring.easyCar.dto.CanceledReqDTO;
import lk.spring.easyCar.service.CanceledReqService;
import lk.spring.easyCar.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/cancelRequest")
public class CancelRequestController {

    @Autowired
    private CanceledReqService service;

    @PostMapping
    public ResponseUtil saveMessage(@RequestBody CanceledReqDTO dto){
        service.saveMessage(dto);
        return new ResponseUtil("200",dto.getId()+ " Added Message.!",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteMessage(String id){
        return null;
    }

    @PutMapping
    public ResponseUtil updateMessage(){
        return null;
    }

    @GetMapping
    public ResponseUtil getAllMessage(){
        ArrayList<CanceledReqDTO> allMessages = service.getAllMessage();
        return new ResponseUtil("200"," Success.!",allMessages);
    }

}
