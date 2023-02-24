package lk.spring.easyCar.service;

import lk.spring.easyCar.dto.ScheduleDTO;

import java.util.ArrayList;

public interface ScheduleService {
    public void saveSchedule(ScheduleDTO dto);

    public void deleteSchedule(int id);

    public void updateSchedule(ScheduleDTO dto);

    public ArrayList<ScheduleDTO> getAllSchedule();
}
