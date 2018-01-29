package com.jea.QuarterFlow.QuarterFlow.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by jahn on 1/29/18.
 */
@Entity
public class Goal extends Timestamped {
    @Column
    private String name;

    @Column
    private double total;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
