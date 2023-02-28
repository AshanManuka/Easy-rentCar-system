package lk.spring.easyCar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;



@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CarDTO {
    private String regNo;
    private String brand;
    private String color;
    private String imageOne;
    private String imageTwo;
    private String imageThree;
    private String imageFour;
    private String imageFive;
    private Boolean isAvailable;
    private String availableDate;
    private String transmissionType;
    private String fuelType;
    private Double chargeForExtraKm;
    private Double dailyRate;
    private Double monthlyRate;
}
