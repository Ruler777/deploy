package hu.crabrave.pipe;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RequestMapping("/")
public class DummyController {
    @Value("${mode}")
    private String mode;

    @GetMapping("adora")
    ResponseEntity<?> adora(){
        return ResponseEntity.ok("Adora " + mode);
    }

    @GetMapping("catra")
    ResponseEntity<?> catra(){
        return ResponseEntity.ok("Catra");
    }
}
