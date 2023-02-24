package lk.spring.easyCar.repo;

import lk.spring.easyCar.entity.ReservationDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationDetailsRepo extends JpaRepository<ReservationDetails,Integer> {
}
