package ie.atu.oop_inclass_07.Service;

import ie.atu.oop_inclass_07.ExceptionHandler.CameraConflict;
import ie.atu.oop_inclass_07.Model.Camera;

import java.util.ArrayList;
import java.util.List;

public class CameraService {
    private final List<Camera> cameras = new ArrayList<>();

    public CameraService createCamera(List<Camera> cameras) {
        boolean IDExists = cameras.stream() {

        }

        if (IDExists) {
            throw new CameraConflict("Camera already exists");
        }
        for (Camera camera : cameras) {
        }
    }

    public List<Camera> getAllCameras() { return cameras; }
}
