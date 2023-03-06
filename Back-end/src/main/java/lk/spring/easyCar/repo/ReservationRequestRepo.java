package lk.spring.easyCar.repo;

import lk.spring.easyCar.entity.ReservationReq;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRequestRepo extends JpaRepository<ReservationReq,Integer> {

}
