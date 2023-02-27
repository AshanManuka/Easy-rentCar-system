package lk.spring.easyCar.service.impl;

import lk.spring.easyCar.dto.DriverDTO;
import lk.spring.easyCar.dto.UserDTO;
import lk.spring.easyCar.entity.Driver;
import lk.spring.easyCar.repo.DriverRepo;
import lk.spring.easyCar.service.DriverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void saveDriver(DriverDTO dto) {
        if (repo.existsById(dto.getId())) {
            throw new RuntimeException("Driver "+dto.getId()+" Already Exist..!");
        }
        repo.save(mapper.map(dto, Driver.class));
    }

    @Override
    public void deleteDriver(int id) {

    }

    @Override
    public void updateDriver(DriverDTO dto) {

    }

    @Override
    public ArrayList<DriverDTO> getAllDriver() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<DriverDTO>>() {}.getType());
    }

    @Override
    public DriverDTO getSelectedDriver(String name) {
        return mapper.map( repo.findDriverByName(name), DriverDTO.class);
    }
}
