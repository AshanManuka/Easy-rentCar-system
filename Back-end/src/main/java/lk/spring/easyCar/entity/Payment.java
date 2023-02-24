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
@Entity
public class Payment {
    @Id
    private int id;
    private LocalDate date;
    private Double value;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "reservationId", referencedColumnName = "id")
    private Reservation reservation;
}
