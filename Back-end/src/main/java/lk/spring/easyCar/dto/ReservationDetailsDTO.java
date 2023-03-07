package lk.spring.easyCar.dto;

import lk.spring.easyCar.entity.Car;
import lk.spring.easyCar.entity.Driver;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReservationDetailsDTO {
    private int id;
    private String pickupDate;
    private String finishDate;
    private double amount;
    private String userMail;
    private String carNo;
    private int driverId;
}
