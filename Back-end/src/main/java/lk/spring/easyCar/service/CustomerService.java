package lk.spring.easyCar.service;

import lk.spring.easyCar.dto.UserDTO;

import java.util.ArrayList;

public interface CustomerService {
    public void saveCustomer(UserDTO dto);

    public void deleteCustomer(int id);

    public void updateCustomer(UserDTO dto);

    public ArrayList<UserDTO> getAllCustomer();

}
