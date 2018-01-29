package com.jea.QuarterFlow.QuarterFlow.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by jahn on 1/29/18.
 */
@Entity
public class Setting {
    @Column
    private String name;

    @Column
    private boolean value;

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
}
