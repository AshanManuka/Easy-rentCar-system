package lk.spring.easyCar.controller;

import lk.spring.easyCar.dto.AdminDTO;
import lk.spring.easyCar.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class AdminController {

    @PostMapping
    public ResponseUtil saveAdmin(@ModelAttribute AdminDTO dto){
        return null;
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
