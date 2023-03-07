package lk.spring.easyCar.repo;

import lk.spring.easyCar.entity.CanceledReq;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CancelRequest extends JpaRepository<CanceledReq,Integer> {
}
