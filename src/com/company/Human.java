package com.company;

public class Human {
    Animal pet;
    private Car car;
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

    public Car getCar() {
        return car;
    }

        public void setCar(Car car) {
            if (this.salary > car.getValue()) {
                this.car = car;
                System.out.println("bought car");
            } else if (this.salary * 12 > car.getValue()) {
                this.car = car;
                System.out.println("you bought a car on the cuff");
            } else {
                System.out.println("Choose cheaper one");
            }
        }




}
