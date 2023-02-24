package lk.spring.easyCar.controller;

import lk.spring.easyCar.dto.AdminDTO;
import lk.spring.easyCar.service.AdminService;
import lk.spring.easyCar.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService service;

    @PostMapping
    public ResponseUtil saveAdmin(@RequestBody AdminDTO dto){
        service.saveAdmin(dto);
        return new ResponseUtil("200",dto.getId()+ " Added Admin.!",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteAdmin(String id){
        return null;
    }

    @PutMapping
    public ResponseUtil updateAdmin(){
        return null;
    }

    @GetMapping
    public ResponseUtil getAllAdmin(){
        return null;
    }







}
