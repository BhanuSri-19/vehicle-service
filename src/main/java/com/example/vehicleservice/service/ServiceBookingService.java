package com.example.vehicleservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.vehicleservice.model.ServiceBooking;
import com.example.vehicleservice.repository.ServiceBookingRepository;

@Service
public class ServiceBookingService {

    private ServiceBookingRepository bookingRepository;

    public ServiceBookingService(ServiceBookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public ServiceBooking bookService(ServiceBooking booking) {
        return bookingRepository.save(booking);
    }

    public List<ServiceBooking> getServiceHistory(Integer customerId) {
        return bookingRepository.findByCustomerId(customerId);
    }
}