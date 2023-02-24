package lk.spring.easyCar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "reservation")
public class Reservation {
    @Id
    private int resId;
    private Date pickupDate;
    private Double time;
    private Date returnDate;
    private String status;
    private int driverId;

    @OneToMany(mappedBy = "reservation",cascade = CascadeType.ALL)
    private List<Payment> payments;

    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "customerId", referencedColumnName = "registerId",nullable = false)
    private Customer customer;

    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "carId", referencedColumnName = "registerCode",nullable = false)
    private Vehicle vehicle;

    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "driverId", referencedColumnName = "nic",nullable = false)
    private Driver driver;






}
