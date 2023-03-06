package lk.spring.easyCar.service.impl;

import lk.spring.easyCar.dto.CarDTO;
import lk.spring.easyCar.dto.ReservationDetailsDTO;
import lk.spring.easyCar.repo.CustomerRepo;
import lk.spring.easyCar.service.ReservationService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
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
    public void saveReservation(ReservationDetailsDTO dto) {

    }

    @Override
    public void deleteReservation(int id) {

    }

    @Override
    public void updateReservation(ReservationDetailsDTO dto) {

    }

    @Override
    public ArrayList<ReservationDetailsDTO> getAllReservation() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<ReservationDetailsDTO>>() {}.getType());
    }
}
