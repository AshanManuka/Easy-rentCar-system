package lk.spring.easyCar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import lk.spring.easyCar.entity.PendingCustomer;

public interface PendingCustomerRepo extends JpaRepository<PendingCustomer,Integer> {
}
