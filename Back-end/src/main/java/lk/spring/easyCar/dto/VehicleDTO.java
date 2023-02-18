package lk.spring.easyCar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VehicleDTO {
    private int registerCode;
    private String brand;
    private  String type;
    private int passengerNo;
    private String transmissionType;
    private String fuelType;
    private String color;
    private Double dailyRate;
    private Double monthlyRate;
    private Double priceForExtra;
}
