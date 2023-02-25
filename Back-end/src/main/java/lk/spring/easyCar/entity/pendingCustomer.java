package lk.spring.easyCar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class PendingCustomer {
    @Id
    private int id;
    private String userName;
    private String password;
    private String email;
    private String contact;
    private String nicImage;
}
