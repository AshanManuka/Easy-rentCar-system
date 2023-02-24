package lk.spring.easyCar.service.impl;

import lk.spring.easyCar.dto.AdminDTO;
import lk.spring.easyCar.repo.CustomerRepo;
import lk.spring.easyCar.service.AdminService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private CustomerRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void saveAdmin(AdminDTO dto) {

    }

    @Override
    public void deleteAdmin(int id) {

    }

    @Override
    public void updateAdmin(AdminDTO dto) {

    }

    @Override
    public ArrayList<AdminDTO> getAllAdmin() {
        return null;
    }
}
