package lk.spring.easyCar.service;

import lk.spring.easyCar.dto.ReservationDTO;

import java.util.ArrayList;

public interface ReservationService {
    public void saveReservation(ReservationDTO dto);

    public void deleteReservation(int id);

    public void updateReservation(ReservationDTO dto);

    public ArrayList<ReservationDTO> getAllReservation();
}
