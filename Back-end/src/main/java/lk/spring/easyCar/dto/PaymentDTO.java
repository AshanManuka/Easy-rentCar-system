package lk.spring.easyCar.dto;

import lk.spring.easyCar.entity.Reservation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PaymentDTO {
    private int id;
    private LocalDate date;
    private Double value;
    private Reservation reservation;
}
