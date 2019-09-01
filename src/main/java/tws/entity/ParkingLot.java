package tws.entity;
public class ParkingLot {
    private String parkingLotID;
    private int capacity;
    private int availablePositionCount;
    private String employeeId;

    public ParkingLot() {
    }

    public ParkingLot(String parkingLotID, int capacity,String employeeId) {
        this.parkingLotID = parkingLotID;
        this.capacity = capacity;
        this.employeeId = employeeId;
    }

    public String getParkingLotID() {
        return parkingLotID;
    }

    public void setParkingLotID(String parkingLotID) {
        this.parkingLotID = parkingLotID;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getAvailablePositionCount() {
        return capacity;
    }

    public void setAvailablePositionCount(int availablePositionCount) {
        this.availablePositionCount = availablePositionCount;
    }
}