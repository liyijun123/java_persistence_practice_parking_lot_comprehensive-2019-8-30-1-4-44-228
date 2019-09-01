package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.ParkingLot;

import java.util.List;

@Mapper
public interface ParkingLotMapper {

    List<ParkingLot> selectAll();

    void insert(@Param("parkinglot") ParkingLot parkingLot);

    List<ParkingLot> selectByEmployeeId(@Param("id") String id);

    void insertParkingBoy(@Param("employeeId") String employeeId,@Param("parkingLotID") String parkingLotID);
}