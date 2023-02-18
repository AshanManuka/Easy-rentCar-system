package lk.spring.easyCar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReservationDTO {
    private int resId;
    private Date pickupDate;
    private Double time;
    private Date returnDate;
    private String status;
    private int customerId;
    private int vehicleCode;
    private int driverId;
}
