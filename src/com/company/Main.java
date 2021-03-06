package com.company;

import java.time.Period;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Madalin", 27, Gender.Female, "QA");
        Employee employee2 = new Employee("Madalin", 29, Gender.Male, "DEVOPS");
        Employee employee3 = new Employee("Catalina", 28, Gender.Male, "WEB");
        Employee employee4 = new Employee("Nelu", 69, Gender.Other, "QA");

//        employee4.displayEmployee();

        Organization organization = new Organization();
        organization.addNewEmployee(employee1);
        organization.addNewEmployee(employee2);
        organization.addNewEmployee(employee3);
        organization.addNewEmployee(employee4);


//        organization.searchByName("Catalina");
//        organization.searchByGender(Gender.Male);
//        organization.searchByDepartment("QA");
//        organization.searchByAge(27);

//        organization.removeById(employee1.id);
//        organization.displayEmployeesList();

//        organization.removeByName("Madalin");
//        organization.displayEmployeesList();

//        organization.editName(employee3, "Ratatata");
//        organization.displayEmployeesList();
//
//        organization.editAge(employee3, 31);
//        organization.displayEmployeesList();
//
        organization.editGender(employee3, Gender.Other);
        organization.displayEmployeesList();
//
//        organization.editDepartment(employee3, "IT");
//        organization.displayEmployeesList();

//        organization.removeEmployee(employee3);
//        organization.displayEmployeesList();
//
//        organization.removeAllEmployees();
//        organization.displayEmployeesList();
    }

}
