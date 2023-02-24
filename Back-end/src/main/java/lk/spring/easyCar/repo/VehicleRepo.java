package lk.spring.easyCar.repo;

import lk.spring.easyCar.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Car,String> {
}
