package lk.spring.easyCar.service;

import lk.spring.easyCar.dto.PendingCustomerDTO;

import java.util.ArrayList;

public interface PendingCustomerService {
    public void savePendingCustomer(PendingCustomerDTO dto);

    public void deleteCustomer();

    public void updateCustomer(PendingCustomerDTO dto);

    public ArrayList<PendingCustomerDTO> getAllCustomer();
}
