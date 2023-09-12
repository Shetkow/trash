import Service.SayingsService;
import model.Sayings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SayingsController {
    @Autowired
    SayingsService service;

    @GetMapping(value = "/news")
    public List<Sayings> getNews() {
        return service.getAllSayings();

    }
    @RequestMapping("/yu")
    public String home(){
        return "Hello World!";
    }
}
