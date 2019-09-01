package tws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.dto.EmployeeDto;
import tws.entity.Employee;
import tws.entity.ParkingLot;
import tws.repository.EmployeeMapper;
import tws.repository.ParkingLotMapper;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private ParkingLotMapper parkingLotMapper;

    //���ͣ���к�
    public void addEmployee(Employee employee){
        employeeMapper.insert(employee);
    }
    //��ȡͣ���к��б�
    public List<Employee> getEmployees(){
        List list = employeeMapper.selectAll();
        return list;
    }
    //����ͣ���к����������ͣ����
    public EmployeeDto getEmpAndLot(String id){
        Employee employee = employeeMapper.selectById(id);
        List list =  parkingLotMapper.selectByEmployeeId(id);
        EmployeeDto employeeDto = new EmployeeDto(employee.getId(),employee.getName(),employee.getAge(),list);
        return employeeDto;
    }
}