package lk.spring.easyCar.repo;

import lk.spring.easyCar.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {

}
