package ashina.carrental.car.api.controller;


import ashina.carrental.car.DataAccess.ColorDao;
import ashina.carrental.car.business.abstracts.ColorService;
import ashina.carrental.car.entities.Color;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/api/colorController")
public class ColorController {
    private final ColorService colorService;
    @Autowired
    public ColorController(ColorService colorService){
        super();
        this.colorService=colorService;
    }
    @PutMapping("/addColor")
    public ResponseEntity<Color> addColor(@RequestParam String colorName){
        Color addedColor=colorService.addColor(colorName);
        return ResponseEntity.ok(addedColor);
    }

}

