package lk.spring.easyCar.service.impl;

import lk.spring.easyCar.dto.ReservationDTO;
import lk.spring.easyCar.repo.CustomerRepo;
import lk.spring.easyCar.service.ReservationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private CustomerRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void saveReservation(ReservationDTO dto) {

    }

    @Override
    public void deleteReservation(int id) {

    }

    @Override
    public void updateReservation(ReservationDTO dto) {

    }

    @Override
    public ArrayList<ReservationDTO> getAllReservation() {
        return null;
    }
}
