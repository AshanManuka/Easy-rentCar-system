package lk.spring.easyCar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import sun.security.util.Password;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * author  Yasith C Bandara
 * created 2/15/2023 - 12:04 PM
 * project back-end-spring
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class User {
    @Id
    private int id;
    private String userName;
    private String password;
    private String email;
    private String contact;
    private String nicImage;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Reservation> reservationList;
}
