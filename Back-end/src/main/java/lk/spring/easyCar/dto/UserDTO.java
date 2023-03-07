package lk.spring.easyCar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
    private String nicImage;
}
