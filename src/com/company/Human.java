package com.company;

public class Human {
    Animal pet;
    Car car;
    Double salary;

    public void setSalary(Double salary) {
        if(salary <= 0){
            System.out.println("U are poor");
        }
        System.out.println("your salary sent to the accountant ");



    }

    public Double getSalary() {
        return salary;
    }

}
