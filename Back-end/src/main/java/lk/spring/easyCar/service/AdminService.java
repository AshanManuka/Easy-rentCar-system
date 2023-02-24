package lk.spring.easyCar.service;

import lk.spring.easyCar.dto.AdminDTO;

import java.util.ArrayList;

public interface AdminService {
    public void saveAdmin(AdminDTO dto);

    public void deleteAdmin(int id);

    public void updateAdmin(AdminDTO dto);

    public ArrayList<AdminDTO> getAllAdmin();
}
