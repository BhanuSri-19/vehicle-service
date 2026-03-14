 package com.example.vehicleservice.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.vehicleservice.model.ServiceBooking;
import com.example.vehicleservice.service.ServiceBookingService;

@RestController
@RequestMapping("/booking")
@CrossOrigin(origins = "http://localhost:5173")
public class ServiceBookingController {

    private ServiceBookingService bookingService;

    public ServiceBookingController(ServiceBookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/add")
    public ServiceBooking addBooking(@RequestBody ServiceBooking booking) {
        return bookingService.bookService(booking);
    }

    @GetMapping("/history/{customerId}")
    public List<ServiceBooking> getHistory(@PathVariable Integer customerId) {
        return bookingService.getServiceHistory(customerId);
    }

    // 👇 ADD THIS METHOD
    @GetMapping("/{customerId}")
    public List<ServiceBooking> getBookings(@PathVariable Integer customerId) {
        return bookingService.getServiceHistory(customerId);
    }
}