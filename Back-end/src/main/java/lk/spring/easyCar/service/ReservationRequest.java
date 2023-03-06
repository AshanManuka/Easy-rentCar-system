package lk.spring.easyCar.service;

import lk.spring.easyCar.dto.ReservationReqDTO;

import java.util.ArrayList;

public interface ReservationRequest {
    public void saveRequest(ReservationReqDTO dto);
    public void DeleteRequest(int id);
    public ArrayList<ReservationReqDTO> getAllRequest();
}
