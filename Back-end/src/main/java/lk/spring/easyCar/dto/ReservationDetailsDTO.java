package lk.spring.easyCar.dto;

import lk.spring.easyCar.entity.Car;
import lk.spring.easyCar.entity.Driver;
import lk.spring.easyCar.entity.Reservation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReservationDetailsDTO {
    private int id;
    private LocalDate pickupDate;
    private String pickupLocation;
    private LocalDate finishDate;
    private String finishLocation;
    private Reservation reservation;
    private Car car;
    private Driver driver;
}
