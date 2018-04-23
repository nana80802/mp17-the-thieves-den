package at.refugeescode.mp17thethievesden;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ThiefEndPoint {
    @GetMapping
    String showTreasure(){
        return "here is our treasure";
    }
}
