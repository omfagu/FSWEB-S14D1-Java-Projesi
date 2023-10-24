package com.workintech.company;

public class SeniorDeveloper extends Employee{

    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(55000);
        System.out.println(getName() + " senior developer begins to work.");
    }
}
