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
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String regNo;
    private String brand;
    private String color;
    private byte[] image;
    private Boolean isAvailable;
    private LocalDate availableDate;
    private String transmissionType;
    private String fuelType;
    private String carType;
    private Double freeMileage;
    private Double chargeForExtraKm;
    private Double dailyRate;
    private Double monthlyRate;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private List<ReservationDetails> reservationDetailsList;

}
