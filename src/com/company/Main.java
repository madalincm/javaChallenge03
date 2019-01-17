package com.company;

import java.time.Period;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Madalin", 27, "Male", "QA");
        Employee employee2 = new Employee("Madalin", 29, "Male", "DEVOPS");
        Employee employee3 = new Employee("Catalina", 28, "Female", "WEB");

        Organization organization = new Organization();
        organization.addNewEmployee(employee1);
        organization.addNewEmployee(employee2);
        organization.addNewEmployee(employee3);


//        organization.searchByName("Catalina");
//        organization.searchByGender("Male");
//        organization.searchByDepartment("QA");
//        organization.searchByAge(27);

//        organization.removeById(employee1.id);
//        organization.displayEmployeesList();

//        organization.removeByName("Madalin");
//        organization.displayEmployeesList();

        organization.editName(employee3, "Ratatata");
        organization.displayEmployeesList();
    }
}