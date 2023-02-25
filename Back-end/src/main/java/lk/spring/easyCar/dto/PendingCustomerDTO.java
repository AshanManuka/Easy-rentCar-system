package lk.spring.easyCar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PendingCustomerDTO {
    private int id;
    private String userName;
    private String password;
    private String email;
    private String contact;
    private String nicImage;
}
