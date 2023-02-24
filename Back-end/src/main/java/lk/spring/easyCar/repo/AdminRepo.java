package lk.spring.easyCar.repo;

import lk.spring.easyCar.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin,Integer> {
}
