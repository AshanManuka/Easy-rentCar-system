package lk.spring.easyCar.service;

import lk.spring.easyCar.dto.ReservationDetailsDTO;

import java.util.ArrayList;

public interface ReservationService {
    public void saveReservation(ReservationDetailsDTO dto);

    public void deleteReservation(int id);

    public void updateReservation(ReservationDetailsDTO dto);

    public ArrayList<ReservationDetailsDTO> getAllReservation();
}
