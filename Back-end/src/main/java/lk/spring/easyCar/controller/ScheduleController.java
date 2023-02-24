package lk.spring.easyCar.controller;

import lk.spring.easyCar.dto.ScheduleDTO;
import lk.spring.easyCar.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/schedule")
public class ScheduleController {

    @PostMapping
    public ResponseUtil makeSchedule(@ModelAttribute ScheduleDTO dto){
        return null;
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteSchedule(String id){
        return null;
    }

    @PutMapping
    public ResponseUtil updateSchedule(){
        return null;
    }

    @GetMapping
    public ResponseUtil getAllSchedule(){
        return null;
    }
}
