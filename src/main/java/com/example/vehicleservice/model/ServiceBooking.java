package com.example.vehicleservice.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="service_booking")
public class ServiceBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vehicleModel;
    private String serviceType;
    private String status;

    private LocalDateTime bookingDate;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;

    public ServiceBooking() {}

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getVehicleModel() { return vehicleModel; }

    public void setVehicleModel(String vehicleModel) { this.vehicleModel = vehicleModel; }

    public String getServiceType() { return serviceType; }

    public void setServiceType(String serviceType) { this.serviceType = serviceType; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public LocalDateTime getBookingDate() { return bookingDate; }

    public void setBookingDate(LocalDateTime bookingDate) { this.bookingDate = bookingDate; }

    public Customer getCustomer() { return customer; }

    public void setCustomer(Customer customer) { this.customer = customer; }
}