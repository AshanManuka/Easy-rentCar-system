package lk.spring.easyCar.service.impl;


import lk.spring.easyCar.dto.ReservationDetailsDTO;
import lk.spring.easyCar.entity.ReservationDetails;
import lk.spring.easyCar.repo.ReservationDetailsRepo;
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
    private ReservationDetailsRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void saveReservation(ReservationDetailsDTO dto) {
        System.out.println("in service : "+dto);
        if (repo.existsById(dto.getId())) {
            throw new RuntimeException("Reservation "+dto.getId()+" Already Exist..!");
        }
        repo.save(mapper.map(dto, ReservationDetails.class));
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
