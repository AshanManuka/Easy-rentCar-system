package lk.spring.easyCar.dto;

import lk.spring.easyCar.entity.ReservationDetails;
import lk.spring.easyCar.entity.Schedule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DriverDTO {
    private int id;
    private String name;
    private String contact;
    private String email;
    private String address;
}
