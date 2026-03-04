package ie.atu.oop_inclass_07.Service;

import ie.atu.oop_inclass_07.ExceptionHandler.CameraConflict;
import ie.atu.oop_inclass_07.Model.Camera;
import java.util.ArrayList;
import java.util.List;

public class CameraService {
    private final List<Camera> cameras = new ArrayList<>();


    public Camera createCamera(Camera camera) {
        boolean IDExists = cameras.stream()
                .anyMatch(b -> b.getCameraId.equals(camera.getCameraId()));
        if (IDExists) {
            throw new CameraConflict("Camera already exists");
        }
        for (Camera existing : cameras) {
            if(existing.getBookingTag().equals(camera.getBookingTag)){
                int newStart = camera.getStartHour();
                int newEnd = camera.getEndHour();
                boolean overlap = newStart < existing.getEndHour() && newEnd > existing.getStartHour();
                if (overlap) {
                    throw new CameraConflict("Camera already exists");
                }
            }

        }
    }
}

