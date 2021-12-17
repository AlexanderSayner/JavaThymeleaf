package sandbox.front.end.simplebootstrap.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiController {
    @GetMapping
    public String index() {
        return """
                {
                  "message" : "hi"
                }
                """;
    }
}
