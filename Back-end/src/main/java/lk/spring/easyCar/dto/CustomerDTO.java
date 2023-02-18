package lk.spring.easyCar.dto;

import java.util.Arrays;

public class CustomerDTO {
    private int registerId;
    private String email;
    private String name;
    private int contact;
    private byte[] docId;
    private String password;


    public CustomerDTO() {
    }

    public CustomerDTO(int registerId, String email, String name, int contact, byte[] docId, String password) {
        this.registerId = registerId;
        this.email = email;
        this.name = name;
        this.contact = contact;
        this.docId = docId;
        this.password = password;
    }

    public int getRegisterId() {
        return registerId;
    }

    public void setRegisterId(int registerId) {
        this.registerId = registerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public byte[] getDocId() {
        return docId;
    }

    public void setDocId(byte[] docId) {
        this.docId = docId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "registerId=" + registerId +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", contact=" + contact +
                ", docId=" + Arrays.toString(docId) +
                ", password='" + password + '\'' +
                '}';
    }
}

