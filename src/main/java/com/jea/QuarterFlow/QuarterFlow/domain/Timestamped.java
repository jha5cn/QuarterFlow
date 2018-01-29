package com.jea.QuarterFlow.QuarterFlow.domain;

import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Created by jahn on 1/29/18.
 */
@MappedSuperclass
public class Timestamped extends BaseEntity {

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdated;

    @PrePersist
    protected void onCreate() {
        dateUpdated = new Date();
        dateCreated = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        dateUpdated = new Date();
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
