package com.driver.model;

import javax.persistence.*;

@Entity
@Table(name = "tripBooking")
public class TripBooking
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tripBookingId;
    private String fromLocation;
    private String  toLocation;


    private Integer distInKm;

    @Enumerated(value = EnumType.STRING)
    private TripStatus tripStatus;
    private Integer bill;

    @JoinColumn
    @ManyToOne
    private Driver driver;

    @JoinColumn
    @ManyToOne
    private Customer customer;



    public TripBooking()
    {

    }

    public TripBooking(String fromLocation, String toLocation, Integer distInKm, TripStatus tripStatus, Integer bill) {
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.distInKm = distInKm;
        this.tripStatus = tripStatus;
        this.bill = bill;
    }
    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getTripBookingId() {
        return tripBookingId;
    }

    public void setTripBookingId(Integer tripBookingId) {
        this.tripBookingId = tripBookingId;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public Integer getDistInKm() {
        return distInKm;
    }

    public void setDistInKm(Integer distInKm) {
        this.distInKm = distInKm;
    }

    public TripStatus getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
    }

    public Integer getBill() {
        return bill;
    }

    public void setBill(Integer bill) {
        this.bill = bill;
    }
}