package ie.atu.oop_inclass_07.Model;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class Camera {
    @NotNull(message = "Booking ID can't be empty")
    private Long CameraId;
    @NotBlank(message = "Booking Tag can't be blank")
    private String BookingTag;
    @NotBlank(message = "Student Email can't be blank")
    @Email(message = "Invalid Email format")
    private String StudentEmail;
    @NotNull(message = "Booking date can't be empty")
    @FutureOrPresent(message = "Booking Date can't be in the past")
    private LocalDate BookingDate;
    @Min(value = 0, message = "Start hour can't be less than 0")
    @Max(value = 23, message = "Start Hour can't be greater than 23")
    private int StartHour;
    @Min(value = 1, message = "Duration can't be less than 1 hour")
    private int DurationHours;

    public Long getCameraId{
        return CameraId;
    }
    public void setCameraId(Long CameraId){
        this.CameraId = CameraId;
    }
    public String getBookingTag{
        return BookingTag;
    }
    public void setBookingTag(String BookingTag){
        this.BookingTag = BookingTag;
    }
    public String getStudentEmail(){
        return StudentEmail;
    }
    public void setStudentEmail(String StudentEmail){
        this.StudentEmail = StudentEmail;
    }
    public LocalDate getBookingDate(){
        return BookingDate;
    }
    public void setBookingDate(LocalDate BookingDate){
        this.BookingDate = BookingDate;
    }
    public int getStartHour(){
        return StartHour;
    }
    public void setStartHour(int StartHour){
        this.StartHour = StartHour;
    }
    public int getDurationHours(){
        return DurationHours;
    }
    public void setDurationHours(int DurationHours){
        this.DurationHours = DurationHours;
    }
    public int getEndHour(int EndHour){
        return EndHour = getStartHour() + getDurationHours() ;
    }

    }