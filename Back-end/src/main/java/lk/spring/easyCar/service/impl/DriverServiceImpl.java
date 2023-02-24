package lk.spring.easyCar.service.impl;

import lk.spring.easyCar.dto.DriverDTO;
import lk.spring.easyCar.repo.CustomerRepo;
import lk.spring.easyCar.service.DriverService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {

    @Autowired
    private CustomerRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void saveDriver(DriverDTO dto) {

    }

    @Override
    public void deleteDriver(int id) {

    }

    @Override
    public void updateDriver(DriverDTO dto) {

    }

    @Override
    public ArrayList<DriverDTO> getAllDriver() {
        return null;
    }
}
