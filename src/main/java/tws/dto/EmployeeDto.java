package tws.dto;

import tws.entity.ParkingLot;

import java.util.List;

public class EmployeeDto {
    private String id;
    private String name;
    private String age;
    private List<ParkingLot> parkingLotList;
    public EmployeeDto() {

    }

    public EmployeeDto(String id, String name, String age, List<ParkingLot> parkingLotList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.parkingLotList = parkingLotList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<ParkingLot> getParkingLotList() {
        List<ParkingLot> lotList = this.parkingLotList;
        return lotList;
    }

    public void setParkingLotList(List<ParkingLot> parkingLotList) {
        this.parkingLotList = parkingLotList;
    }
}