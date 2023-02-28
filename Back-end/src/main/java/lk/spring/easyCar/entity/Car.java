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
    private String regNo;
    private String brand;
    private String color;
    private String imageOne;
    private String imageTwo;
    private String imageThree;
    private String imageFour;
    private String imageFive;
    private Boolean isAvailable;
    private String availableD;
    private String transmissionType;
    private String fuelType;
    private Double chargeForExtraKm;
    private Double dailyRate;
    private Double monthlyRate;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private List<ReservationDetails> reservationDetailsList;

}
