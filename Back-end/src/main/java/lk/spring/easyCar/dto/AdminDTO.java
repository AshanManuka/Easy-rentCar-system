package lk.spring.easyCar.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AdminDTO {
    private String name;
    private String userName;
    private String password;
    private String nic;

}
