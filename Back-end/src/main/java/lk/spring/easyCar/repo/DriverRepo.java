package lk.spring.easyCar.repo;

import lk.spring.easyCar.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepo extends JpaRepository<Driver,Integer> {

}
