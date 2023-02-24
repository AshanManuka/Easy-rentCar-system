package lk.spring.easyCar.service.impl;

import lk.spring.easyCar.dto.PaymentDTO;
import lk.spring.easyCar.repo.CustomerRepo;
import lk.spring.easyCar.service.PaymentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private CustomerRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void savePayment(PaymentDTO dto) {

    }

    @Override
    public void deletePayment(int id) {

    }

    @Override
    public void updatePayment(PaymentDTO dto) {

    }

    @Override
    public ArrayList<PaymentDTO> getAllPayment() {
        return null;
    }
}
