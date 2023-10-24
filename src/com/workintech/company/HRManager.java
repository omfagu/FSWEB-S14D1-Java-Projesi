package com.workintech.company;


import java.util.Arrays;

public class HRManager extends Employee {

    //[null, null, null, null]
    private JuniorDeveloper[] juniors;
    private MidDeveloper[] mids;
    private SeniorDeveloper[] seniors;
    //private String[] denemeler;

    public HRManager(long id, String name, double salary, JuniorDeveloper[] juniors, MidDeveloper[] mids,
                     SeniorDeveloper[] seniors) {
        super(id, name, salary);
        this.juniors = juniors;
        this.mids = mids;
        this.seniors = seniors;
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper) {

        //juniors[index] != null && juniors[index].getName().contains(juniorDeveloper.getName());


        try {
            if (juniors[index] == null) {
                juniors[index] = juniorDeveloper;
            } else {
                System.out.println("Index is full");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("Index not found: " + exception.getMessage());
        }
    }

    public void addEmployee(int index, MidDeveloper midDeveloper) {
        try {
            if (mids[index] == null) {
                mids[index] = midDeveloper;
            } else {
                System.out.println("Index is full");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("Index not found: " + exception.getMessage());
        }
    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper) {
        try {
            if (seniors[index] == null) {
                seniors[index] = seniorDeveloper;
            } else {
                System.out.println("Index is full");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("Index not found: " + exception.getMessage());
        }
    }

    @Override
    public void work() {
        setSalary(70000);
        System.out.println(getName() + " hr manager begins to work.");
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "juniors=" + Arrays.toString(juniors) +
                ", mids=" + Arrays.toString(mids) +
                ", seniors=" + Arrays.toString(seniors) +
                '}';
    }
}