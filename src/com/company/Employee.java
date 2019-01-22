package com.company;

import java.util.UUID;

/**
 * Created by madalin.cotetiu on 1/17/2019.
 */
public class Employee {

    public String name;
    public int age;
    public Gender gender;
    public String department;
    public String id;

    public Employee(String name, int age, Gender gender, String department) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.id = UUID.randomUUID().toString();

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void displayEmployee(){
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
        System.out.println("gender: " + this.gender);
        System.out.println("departments: " + this.department);
        System.out.println("id: " + this.id);
        System.out.println("------------------");
    }


}
