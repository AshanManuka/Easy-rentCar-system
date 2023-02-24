package lk.spring.easyCar.repo;

import lk.spring.easyCar.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment,Integer> {
}
