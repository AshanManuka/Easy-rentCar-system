package lk.spring.easyCar.service.impl;

import lk.spring.easyCar.dto.AdminDTO;
import lk.spring.easyCar.dto.CanceledReqDTO;
import lk.spring.easyCar.entity.Admin;
import lk.spring.easyCar.entity.CanceledReq;
import lk.spring.easyCar.repo.CancelRequest;
import lk.spring.easyCar.service.CanceledReqService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class CancelReqServiceImpl implements CanceledReqService {

    @Autowired
    private CancelRequest repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void saveMessage(CanceledReqDTO dto) {
        if (repo.existsById(dto.getId())) {
            throw new RuntimeException("Message "+dto.getId()+" Already Exist..!");
        }
        repo.save(mapper.map(dto, CanceledReq.class));
    }

    @Override
    public void deleteMessage(int id) {

    }

    @Override
    public void updateMessage(CanceledReqDTO dto) {

    }

    @Override
    public ArrayList<CanceledReqDTO> getAllMessage() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<CanceledReqDTO>>() {}.getType());
    }
}
