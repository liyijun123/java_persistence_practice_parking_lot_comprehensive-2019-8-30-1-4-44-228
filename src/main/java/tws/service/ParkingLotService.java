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

    //添加停车场
    public void addParkingLot(ParkingLot parkingLot){
        parkingLotMapper.insert(parkingLot);
    }
    //获取停车场
    public List<ParkingLot> getParkingLots(){
        List<ParkingLot> list = parkingLotMapper.selectAll();
        return list;
    }

    //给停车场配备停车男孩
    public void addparkingBoy(String id,ParkingLot parkingLot){
        String parkingLotID = parkingLot.getParkingLotID();
        parkingLotMapper.insertParkingBoy(id,parkingLotID);
    }
}