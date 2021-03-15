package Controllers;

import Commons.FuncWritingReading;
import Commons.Validation;
import Models.Employees;
import Models.Villa;

import java.util.*;

public class EmployeeManagement {
    Validation validation = new Validation();
    Scanner scanner = new Scanner(System.in);
    FuncWritingReading funcWritingReading = new FuncWritingReading();
    ServiceManagement serviceManagement = new ServiceManagement();
    public void show(){
        List<String[]> list = funcWritingReading.readFromFile("Employees.csv");
        Map<String,Employees> employeesHashMap=new HashMap<>();
        for (String[] employeeInfo : list) {
            employeesHashMap.put(employeeInfo[3],new Employees(employeeInfo[0],Byte.parseByte(employeeInfo[1]),employeeInfo[2]));
        }
        Set<String> keySet=employeesHashMap.keySet();
        for (String key:keySet) {
            System.out.println(key+" - "+employeesHashMap.get(key));
        }
    }
}
