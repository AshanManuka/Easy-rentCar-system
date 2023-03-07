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
public class ScheduleDTO {
    private int id;
    private LocalDate pickupDate;
    private LocalDate finishDate;
    private int driverId;
}
