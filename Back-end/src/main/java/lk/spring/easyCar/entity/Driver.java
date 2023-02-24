package lk.spring.easyCar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "driver")
public class Driver {
    @Id
    private String nic;
    private String name;
    private String address;

    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
    private List<Schedule> schedules;
}
