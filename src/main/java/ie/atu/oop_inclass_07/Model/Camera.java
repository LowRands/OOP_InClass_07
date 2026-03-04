package ie.atu.oop_inclass_07.Model;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class Camera {
    @NotNull(message = "Booking ID can't be empty")
    private Long BookingID;
    @NotBlank(message = "Booking Tag can't be blank")
    private String bookingTag;
    @NotBlank(message = "Student Email can't be blank")
    @Email(message = "Invalid Email format")
    private String studentEmail;
    @NotNull(message = "Booking date can't be empty")
    @FutureOrPresent(message = "Booking Date can't be in the past")
    private LocalDate bookingDate;
    @Min(value = 0, message = "Start hour can't be less than 0")
    @Max(value = 23, message = "Start Hour can't be greater than 23")
    private int startHour;
    @Min(value = 1, message = "Duration can't be less than 1 hour")
    private int durationHours;

    public Camera() {
        public Long getBookingID{return BookingID;}
        public Void setBookingID(Long BookingID){ this.BookingID = BookingID;}

    }
}

