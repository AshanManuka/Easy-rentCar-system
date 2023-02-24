package lk.spring.easyCar.service;

import lk.spring.easyCar.dto.DriverDTO;

import java.util.ArrayList;

public interface DriverService {
    public void saveDriver(DriverDTO dto);

    public void deleteDriver(int id);

    public void updateDriver(DriverDTO dto);

    public ArrayList<DriverDTO> getAllDriver();
}
