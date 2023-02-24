package lk.spring.easyCar.service.impl;

import lk.spring.easyCar.dto.CarDTO;
import lk.spring.easyCar.repo.CustomerRepo;
import lk.spring.easyCar.service.VehicleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private CustomerRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void saveVehicle(CarDTO dto) {

    }

    @Override
    public void deleteVehicle(int id) {

    }

    @Override
    public void updateVehicle(CarDTO dto) {

    }

    @Override
    public ArrayList<CarDTO> getAllVehicle() {
        return null;
    }
}
