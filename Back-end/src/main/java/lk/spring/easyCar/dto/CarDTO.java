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
}
