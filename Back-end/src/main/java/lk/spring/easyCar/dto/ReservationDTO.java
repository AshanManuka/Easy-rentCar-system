package lk.spring.easyCar.dto;

import lk.spring.easyCar.entity.Payment;
import lk.spring.easyCar.entity.ReservationDetails;
import lk.spring.easyCar.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReservationDTO {
    private int id;
    private LocalDate date;
    private User user;
    private List<Payment> paymentList;
    private List<ReservationDetails> reservationDetailsList;
}
