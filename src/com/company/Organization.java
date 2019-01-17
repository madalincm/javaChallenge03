package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by madalin.cotetiu on 1/17/2019.
 */
public class Organization {
    private ArrayList<Employee> employeesList;

    public Organization() {
        this.employeesList = new ArrayList<Employee>();
    }

    public Organization(ArrayList<Employee> employeesList){
        this.employeesList = employeesList;
    }

    public void addNewEmployee(Employee employee){
        this.employeesList.add(employee);
    }

    public void removeAllEmployees(){
        this.employeesList.clear();
    }

    public void searchByName(String name){
        List<Employee> filtered = this.employeesList.stream().filter(x -> x.name == name).collect(Collectors.toList());
        if(filtered.size() == 0){
            System.out.println("We could not find any employees with that name");
        } else {
            System.out.println("We have found " + filtered.size() + " employee(s)");
            for (Employee employee : filtered
                    ) {
                employee.displayEmployee();
            }
        }

    }

    public void searchByGender(String gender){
        List<Employee> filtered = this.employeesList.stream().filter(x -> x.gender == gender).collect(Collectors.toList());
        if(filtered.size() == 0){
            System.out.println("We could not find any employees with that gender");
        } else {
            System.out.println("We have found " + filtered.size() + " employee(s)");
            for (Employee employee : filtered
                    ) {
                employee.displayEmployee();
            }
        }
    }


    public void searchByDepartment(String department){
        List<Employee> filtered = this.employeesList.stream().filter(x -> x.department == department).collect(Collectors.toList());
        if(filtered.size() == 0){
            System.out.println("We could not find any employees in that department");
        } else {
            System.out.println("We have found " + filtered.size() + " employee(s)");
            for (Employee employee : filtered
                    ) {
                employee.displayEmployee();
            }
        }
    }

    public void searchByAge(int age){
        List<Employee> filtered = this.employeesList.stream().filter(x -> x.age == age).collect(Collectors.toList());
        if(filtered.size() == 0){
            System.out.println("We could not find any employees with that age");
        } else {
            System.out.println("We have found " + filtered.size() + " employee(s)");
            for (Employee employee : filtered
                    ) {
                employee.displayEmployee();
            }
        }
    }

    public void removeById(String id){
        List<Employee> filtered = this.employeesList.stream().filter(x -> x.id != id).collect(Collectors.toList());
        if(filtered.size() == 0){
            System.out.println("This id is not matching any employee");
        } else {
            this.employeesList = new ArrayList<Employee>(filtered);
            System.out.println("The employee was deleted");
        }
    }

    public void removeByName(String name){
        List<Employee> filtered = this.employeesList.stream().filter(x -> x.name != name).collect(Collectors.toList());
        if(filtered.size() == 0){
            System.out.println("We could not find any employees with that name");
        } else {
            this.employeesList = new ArrayList<Employee>(filtered);
            System.out.println("All the employees with the name " + name + " were deleted");
        }
    }

    public void editName(Employee employee, String name){
        this.employeesList.get(this.employeesList.indexOf(employee)).name = name;
    }


    public void displayEmployeesList(){
        if(this.employeesList.size() == 0) {
            System.out.println("There are NO employees in your organization!");
        } else {
            System.out.println("The employees from your organization are:");
            for (Employee employee : this.employeesList
                 ) {
                employee.displayEmployee();
            }
        }
    }
}
