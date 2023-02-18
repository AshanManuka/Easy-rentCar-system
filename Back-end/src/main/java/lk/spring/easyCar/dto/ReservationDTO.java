package lk.spring.easyCar.dto;

import java.util.Date;

public class ReservationDTO {
    private int resId;
    private Date pickupDate;
    private Double time;
    private Date returnDate;
    private String status;
    private int customerId;
    private int vehicleCode;
    private int driverId;

    public ReservationDTO() {
    }

    public ReservationDTO(int resId, Date pickupDate, Double time, Date returnDate, String status, int customerId, int vehicleCode, int driverId) {
        this.resId = resId;
        this.pickupDate = pickupDate;
        this.time = time;
        this.returnDate = returnDate;
        this.status = status;
        this.customerId = customerId;
        this.vehicleCode = vehicleCode;
        this.driverId = driverId;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getVehicleCode() {
        return vehicleCode;
    }

    public void setVehicleCode(int vehicleCode) {
        this.vehicleCode = vehicleCode;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    @Override
    public String toString() {
        return "ReservationDTO{" +
                "resId='" + resId + '\'' +
                ", pickupDate=" + pickupDate +
                ", time=" + time +
                ", returnDate=" + returnDate +
                ", status='" + status + '\'' +
                ", customerId=" + customerId +
                ", vehicleCode=" + vehicleCode +
                ", driverId=" + driverId +
                '}';
    }
}
