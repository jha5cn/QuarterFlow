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
public class Setting extends Timestamped {
    @Column
    private String name;

    @Column
    private boolean value;

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

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
