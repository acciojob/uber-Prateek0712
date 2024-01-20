package com.driver.model;


import javax.persistence.*;
import java.sql.Driver;

@Entity
@Table(name = "Cab")
public class Cab
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer cabId;

    private  Integer perKmRate;
    private Boolean available;

    @JoinColumn
    @OneToOne
    private Driver driver;


    public Cab ()
    {

    }
    public Cab(Integer perKmRate, Boolean available, Driver driver) {
        this.perKmRate = perKmRate;
        this.available = available;
        this.driver = driver;
    }

    public Integer getCabId() {
        return cabId;
    }

    public void setCabId(Integer cabId) {
        this.cabId = cabId;
    }

    public Integer getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(Integer perKmRate) {
        this.perKmRate = perKmRate;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}