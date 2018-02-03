package com.jea.QuarterFlow.QuarterFlow.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by jahn on 1/29/18.
 */
@Entity
public class Goal extends Timestamped {
    @Column
    private String name;

    @Column
    private double total;

    @ManyToOne
    @JsonBackReference
    @JoinColumn
    private User user;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
