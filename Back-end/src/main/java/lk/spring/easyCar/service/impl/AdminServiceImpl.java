package lk.spring.easyCar.service.impl;

import lk.spring.easyCar.dto.AdminDTO;
import lk.spring.easyCar.entity.Admin;
import lk.spring.easyCar.repo.AdminRepo;
import lk.spring.easyCar.service.AdminService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void saveAdmin(AdminDTO dto) {
        if (repo.existsById(dto.getId())) {
            throw new RuntimeException("Admin "+dto.getId()+" Already Exist..!");
        }
         repo.save(mapper.map(dto,Admin.class));
        System.out.println(dto);
    }

    @Override
    public void deleteAdmin(int id) {

    }

    @Override
    public void updateAdmin(AdminDTO dto) {

    }

    @Override
    public ArrayList<AdminDTO> getAllAdmin() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<AdminDTO>>() {}.getType());
    }


}
