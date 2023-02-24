package lk.spring.easyCar.repo;

import lk.spring.easyCar.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<User,Integer> {

}
