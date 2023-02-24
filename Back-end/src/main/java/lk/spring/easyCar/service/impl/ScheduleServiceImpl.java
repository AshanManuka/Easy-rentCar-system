package lk.spring.easyCar.service.impl;

import lk.spring.easyCar.dto.ScheduleDTO;
import lk.spring.easyCar.repo.CustomerRepo;
import lk.spring.easyCar.service.ScheduleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private CustomerRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void saveSchedule(ScheduleDTO dto) {

    }

    @Override
    public void deleteSchedule(int id) {

    }

    @Override
    public void updateSchedule(ScheduleDTO dto) {

    }

    @Override
    public ArrayList<ScheduleDTO> getAllSchedule() {
        return null;
    }
}
