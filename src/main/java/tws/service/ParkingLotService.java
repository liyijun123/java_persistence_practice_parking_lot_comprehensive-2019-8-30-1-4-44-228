package tws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.entity.ParkingLot;
import tws.repository.ParkingLotMapper;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingLotService {
    @Autowired
    private ParkingLotMapper parkingLotMapper;

    //���ͣ����
    public void addParkingLot(ParkingLot parkingLot){
        parkingLotMapper.insert(parkingLot);
    }
    //��ȡͣ����
    public List<ParkingLot> getParkingLots(){
        List<ParkingLot> list = parkingLotMapper.selectAll();
        return list;
    }

    //��ͣ�����䱸ͣ���к�
    public void addparkingBoy(String id,ParkingLot parkingLot){
        String parkingLotID = parkingLot.getParkingLotID();
        parkingLotMapper.insertParkingBoy(id,parkingLotID);
    }
}