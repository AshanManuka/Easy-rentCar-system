package lk.spring.easyCar.dto;

import java.util.Date;

public class ScheduleDTO {
    private String driverNic;
    private Date tripDate;
    private int duration;

    public ScheduleDTO() {
    }

    public ScheduleDTO(String driverNic, Date tripDate, int duration) {
        this.driverNic = driverNic;
        this.tripDate = tripDate;
        this.duration = duration;
    }

    public String getDriverNic() {
        return driverNic;
    }

    public void setDriverNic(String driverNic) {
        this.driverNic = driverNic;
    }

    public Date getTripDate() {
        return tripDate;
    }

    public void setTripDate(Date tripDate) {
        this.tripDate = tripDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "ScheduleDTO{" +
                "driverNic='" + driverNic + '\'' +
                ", tripDate=" + tripDate +
                ", duration=" + duration +
                '}';
    }
}
