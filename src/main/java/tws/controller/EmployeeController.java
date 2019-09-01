package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.dto.EmployeeDto;
import tws.entity.Employee;
import tws.entity.ParkingLot;
import tws.repository.EmployeeMapper;
import tws.repository.ParkingLotMapper;
import tws.service.EmployeeService;
import tws.service.ParkingLotService;


import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private ParkingLotService parkingLotService;

    @GetMapping("")
    public ResponseEntity<List<Employee>> getAll() {
        return ResponseEntity.ok(employeeService.getEmployees());
    }

    @PostMapping("")
    public ResponseEntity<Employee> insert(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return ResponseEntity.created(URI.create("/employees/" + employee.getId())).body(employee);
    }

    @PostMapping("/{id}")
    public ResponseEntity<ParkingLot> parkingLotOfBoy(@RequestBody ParkingLot parkingLot,@PathVariable String id) {
        parkingLotService.addparkingBoy(id,parkingLot);
        return ResponseEntity.created(URI.create("/employees/" + parkingLot.getEmployeeId())).body(parkingLot);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getParkingBoyAndParkingLot(@PathVariable String id) {
        EmployeeDto employeeDto = employeeService.getEmpAndLot(id);
        return ResponseEntity.ok(employeeDto);
    }
}
