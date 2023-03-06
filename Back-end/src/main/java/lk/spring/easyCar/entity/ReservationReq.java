package lk.spring.easyCar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class ReservationReq {
    @Id
    private int id;
    private LocalDate pickupDate;
    private LocalDate finishDate;
    private String paymentStatus;
    private String user;
    private String car;
    private String driverStatus;
}
