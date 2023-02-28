package lk.spring.easyCar.service.impl;

import lk.spring.easyCar.dto.CarDTO;
import lk.spring.easyCar.entity.Car;
import lk.spring.easyCar.repo.VehicleRepo;
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
    private VehicleRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void saveVehicle(CarDTO dto) {
        /*if (repo.exists(dto.getRegNo())) {
            throw new RuntimeException("Vehicle "+dto.getRegNo()+" Already Exist..!");
        }*/
        repo.save(mapper.map(dto,Car.class));
    }

    @Override
    public void deleteVehicle(String id) {

    }

    @Override
    public void updateVehicle(CarDTO dto) {

    }

    @Override
    public ArrayList<CarDTO> getAllVehicle() {
        return null;
    }
}
