package lk.spring.easyCar.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "payment")
public class Payment {
    @Id
    private int paymentId;
    private int resId;
    private Double amount;
    private int adminId;
    private String advanceStatus;

    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "paymentId", referencedColumnName = "paymentId",nullable = false)
    private Payment payment;
}
