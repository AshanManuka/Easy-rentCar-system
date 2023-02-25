package lk.spring.easyCar.service.impl;

import lk.spring.easyCar.dto.PendingCustomerDTO;
import lk.spring.easyCar.entity.PendingCustomer;
import lk.spring.easyCar.repo.PendingCustomerRepo;
import lk.spring.easyCar.service.PendingCustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class PendingCustomerServiceImpl implements PendingCustomerService {

    @Autowired
    private PendingCustomerRepo Repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void savePendingCustomer(PendingCustomerDTO dto) {
        if (Repo.existsById(dto.getId())) {
            throw new RuntimeException("Customer "+dto.getId()+" Already Exist..!");
        }
        Repo.save(mapper.map(dto, PendingCustomer.class));
    }

    @Override
    public void deleteCustomer(int id) {

    }

    @Override
    public void updateCustomer(PendingCustomerDTO dto) {

    }

    @Override
    public ArrayList<PendingCustomerDTO> getAllCustomer() {
        return null;
    }
}
