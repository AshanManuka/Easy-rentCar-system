package lk.spring.easyCar.repo;

import lk.spring.easyCar.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepo extends JpaRepository<Schedule,Integer> {
}
