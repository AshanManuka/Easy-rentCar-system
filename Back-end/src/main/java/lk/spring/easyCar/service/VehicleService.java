package lk.spring.easyCar.service;

import lk.spring.easyCar.dto.CarDTO;
import lk.spring.easyCar.dto.UserDTO;

import java.util.ArrayList;

public interface VehicleService {
    public void saveVehicle(CarDTO dto);

    public void deleteVehicle(String id);

    public void updateVehicle(CarDTO dto);

    public ArrayList<CarDTO> getAllVehicle();
}
