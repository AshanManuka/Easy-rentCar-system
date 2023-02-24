package lk.spring.easyCar.service;

import lk.spring.easyCar.dto.PaymentDTO;

import java.util.ArrayList;

public interface PaymentService {
    public void savePayment(PaymentDTO dto);

    public void deletePayment(int id);

    public void updatePayment(PaymentDTO dto);

    public ArrayList<PaymentDTO> getAllPayment();
}
