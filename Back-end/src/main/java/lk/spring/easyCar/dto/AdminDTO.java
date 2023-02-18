package lk.spring.easyCar.dto;

public class AdminDTO {
    private String name;
    private String userName;
    private String password;
    private String nic;

    public AdminDTO() {
    }

    public AdminDTO(String name, String userName, String password, String nic) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    @Override
    public String toString() {
        return "AdminDTO{" +
                "name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", nic='" + nic + '\'' +
                '}';
    }
}
