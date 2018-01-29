package com.jea.QuarterFlow.QuarterFlow.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by jahn on 1/29/18.
 */
@Entity
public class Account extends Timestamped {
    @Column
    private String name;

    @Column
    private String type;

    @Column
    private double currentBalance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }
}
