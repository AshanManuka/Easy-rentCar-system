package lk.spring.easyCar.dto;

import lk.spring.easyCar.entity.Reservation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO {
    private int id;
    private String userName;
    private String password;
    private String email;
    private String contact;
    private String nicNo;
    private byte[] nicImageFront;
    private byte[] nicImageBack;
    private String drivingLicenseNo;
    private byte[] drivingLicenseImageFront;
    private byte[] drivingLicenseImageBack;

    private List<Reservation> reservationList;
}
