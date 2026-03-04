package ie.atu.oop_inclass_07.Conroller;

import ie.atu.oop_inclass_07.Model.Camera;
import ie.atu.oop_inclass_07.Service.CameraService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class CameraController {
   private final CameraService cameraService;
   public CameraController(CameraService cameraService) {
       this.cameraService = cameraService;
   }
   @PostMapping
    public ResponseEntity<Camera> CreateCamera(@Valid @RequestBody Camera camera) {
       Camera created = cameraService.createCamera(camera)
               return new ResponseEntity<>(created, HttpStatus.CREATED);
   }
    @GetMapping
    public ResponseEntity<List<Camera>> GetAllCameras() {
       return ResponseEntity.ok(CameraService.getAllCameras());
    }
}
