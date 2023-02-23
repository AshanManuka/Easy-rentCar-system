package lk.spring.easyCar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Vehicle {
    @Id
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
