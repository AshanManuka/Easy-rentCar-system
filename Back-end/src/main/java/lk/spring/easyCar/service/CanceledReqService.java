package lk.spring.easyCar.service;

import lk.spring.easyCar.dto.CanceledReqDTO;

import java.util.ArrayList;

public interface CanceledReqService {
    public void saveMessage(CanceledReqDTO dto);

    public void deleteMessage(int id);

    public void updateMessage(CanceledReqDTO dto);

    public ArrayList<CanceledReqDTO> getAllMessage();
}
