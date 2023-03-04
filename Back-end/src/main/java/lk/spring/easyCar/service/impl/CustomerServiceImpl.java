package lk.spring.easyCar.service.impl;

import lk.spring.easyCar.dto.UserDTO;
import lk.spring.easyCar.entity.User;
import lk.spring.easyCar.repo.CustomerRepo;
import lk.spring.easyCar.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo repo;

    @Autowired
    private ModelMapper mapper;



    @Override
    public void saveCustomer(UserDTO dto) {
        if (repo.existsById(dto.getId())) {
            throw new RuntimeException("Customer "+dto.getId()+" Already Exist..!");
        }
        repo.save(mapper.map(dto, User.class));
    }

    @Override
    public void deleteCustomer(int id) {
        if (!repo.existsById(id)){
            throw new RuntimeException("Customer "+id+" Not Available to Delete..!");
        }
        repo.deleteById(id);
    }

    @Override
    public void updateCustomer(UserDTO dto) {

    }

    @Override
    public ArrayList<UserDTO> getAllCustomer() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<UserDTO>>() {}.getType());
    }


}
