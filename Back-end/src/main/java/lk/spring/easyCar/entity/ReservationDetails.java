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

    private LocalDate pickupDate;
    private LocalDate finishDate;

    @OneToMany(mappedBy = "reservationDetails", cascade = CascadeType.ALL)
    private List<Payment> paymentList;

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "carId", referencedColumnName = "regNo")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "driverId", referencedColumnName = "id")
    private Driver driver;

}
