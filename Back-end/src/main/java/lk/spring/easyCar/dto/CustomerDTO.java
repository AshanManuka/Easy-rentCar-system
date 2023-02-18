package lk.spring.easyCar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Arrays;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerDTO {
    private int registerId;
    private String email;
    private String name;
    private int contact;
    private byte[] docId;
    private String password;

}

