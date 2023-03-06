package lk.spring.easyCar.service.impl;

import lk.spring.easyCar.dto.ReservationReqDTO;
import lk.spring.easyCar.entity.ReservationReq;
import lk.spring.easyCar.repo.ReservationRequestRepo;
import lk.spring.easyCar.service.ReservationRequest;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class ReservationRequestImpl implements ReservationRequest {

    @Autowired
    private ReservationRequestRepo Repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveRequest(ReservationReqDTO dto) {
        if (Repo.existsById(dto.getId())) {
            throw new RuntimeException("Customer "+dto.getId()+" Already Exist..!");
        }
        Repo.save(mapper.map(dto, ReservationReq.class));
    }

    @Override
    public void DeleteRequest() {

    }

    @Override
    public ArrayList<ReservationReqDTO> getAllRequest() {
        return mapper.map(Repo.findAll(), new TypeToken<ArrayList<ReservationReqDTO>>() {}.getType());
    }
}
