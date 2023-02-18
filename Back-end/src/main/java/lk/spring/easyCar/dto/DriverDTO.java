package lk.spring.easyCar.dto;

public class DriverDTO {
    private String nic;
    private String name;
    private String address;

    public DriverDTO() {
    }

    public DriverDTO(String nic, String name, String address) {
        this.nic = nic;
        this.name = name;
        this.address = address;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "DriverDTO{" +
                "nic='" + nic + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
