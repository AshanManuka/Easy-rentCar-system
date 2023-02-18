package lk.spring.easyCar.dto;

public class VehicleDTO {
    private int registerCode;
    private String brand;
    private  String type;
    private int passengerNo;
    private String transmissionType;
    private String fuelType;
    private String color;
    private Double dailyRate;
    private Double monthlyRate;
    private Double priceForExtra;

    public VehicleDTO() {
    }

    public VehicleDTO(int registerCode, String brand, String type, int passengerNo, String transmissionType, String fuelType, String color, Double dailyRate, Double monthlyRate, Double priceForExtra) {
        this.registerCode = registerCode;
        this.brand = brand;
        this.type = type;
        this.passengerNo = passengerNo;
        this.transmissionType = transmissionType;
        this.fuelType = fuelType;
        this.color = color;
        this.dailyRate = dailyRate;
        this.monthlyRate = monthlyRate;
        this.priceForExtra = priceForExtra;
    }

    public int getRegisterCode() {
        return registerCode;
    }

    public void setRegisterCode(int registerCode) {
        this.registerCode = registerCode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPassengerNo() {
        return passengerNo;
    }

    public void setPassengerNo(int passengerNo) {
        this.passengerNo = passengerNo;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(Double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public Double getMonthlyRate() {
        return monthlyRate;
    }

    public void setMonthlyRate(Double monthlyRate) {
        this.monthlyRate = monthlyRate;
    }

    public Double getPriceForExtra() {
        return priceForExtra;
    }

    public void setPriceForExtra(Double priceForExtra) {
        this.priceForExtra = priceForExtra;
    }

    @Override
    public String toString() {
        return "VehicleDTO{" +
                "registerCode=" + registerCode +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", passengerNo=" + passengerNo +
                ", transmissionType='" + transmissionType + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", color='" + color + '\'' +
                ", dailyRate=" + dailyRate +
                ", monthlyRate=" + monthlyRate +
                ", priceForExtra=" + priceForExtra +
                '}';
    }
}
