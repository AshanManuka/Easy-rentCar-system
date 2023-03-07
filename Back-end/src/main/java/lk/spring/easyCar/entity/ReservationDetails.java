package lk.spring.easyCar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "reservation_details")
public class ReservationDetails {
    @Id
    private int id;
    private String pickupDate;
    private String finishDate;
    private double amount;
    private String userMail;
    private String carNo;
    private int driverId;

}
