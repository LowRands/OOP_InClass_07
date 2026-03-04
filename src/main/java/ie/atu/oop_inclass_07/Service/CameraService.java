package ie.atu.oop_inclass_07.Service;

import ie.atu.oop_inclass_07.Model.Camera;

import java.util.ArrayList;
import java.util.List;

public class CameraService {
    private final List<Camera> cameras = new ArrayList<>();
    public CameraService createCamera(List<Camera> cameras) {

    }
    public List<Camera> getAllCameras() { return cameras; }
}
