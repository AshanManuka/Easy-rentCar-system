package lk.spring.easyCar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "reservation_details")
public class ReservationDetails {
    @Id
    private int id;

    private LocalDate pickupDate;
    private String pickupLocation;
    private LocalDate finishDate;
    private String finishLocation;

    @ManyToOne
    @JoinColumn(name = "reservationId", referencedColumnName = "id")
    private Reservation reservation;

    @ManyToOne
    @JoinColumn(name = "carId", referencedColumnName = "id")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "driverId", referencedColumnName = "id")
    private Driver driver;

}
