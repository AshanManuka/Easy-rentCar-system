package lk.spring.easyCar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@ToString
public class Customer {
    @Id
    private int registerId;
    private String email;
    private String name;
    private int contact;
    private byte[] docId;
    private String password;
}
