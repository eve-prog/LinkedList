package com.evma;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transanctions;

    public Customer(String name,double initialAmount) {
        this.name = name;
        this.transanctions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount){
        this.transanctions.add(amount); //autoboxing
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransanctions() {
        return transanctions;
    }
}
