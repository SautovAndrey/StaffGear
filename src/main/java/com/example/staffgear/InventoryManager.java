package com.example.staffgear;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryManager {

    List<Employee> employees;
    Map<Employee, List<Equipment>> inventory;

    public InventoryManager() {
        this.employees = new ArrayList<>();
        this.inventory = new HashMap<>();
    }


    public void addEmployee(Employee employee) {
        employees.add(employee);
        inventory.put(employee, new ArrayList<>());
    }
}
