package app.skillcaptain.springBoot;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class DemoController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/hello")
    public String helloWorld(){
        return "<h1 > Hello Wrld </h1>";
    }

    @GetMapping("/hellow")
    public String helloWold(){
        return "<h1 > Hellow Wrld </h1>";
    }

    @GetMapping("/param")
    public String helloWithParam(@RequestParam("name") String parameter){
        return "<h1 > Hello Wrld </h1>"+ parameter;
    }

    @GetMapping("/path/{id}")
    public String helloWorldWithPathParam(@PathVariable String id){
        return "<h1 style=\"color: red\">Hello </h1>" + " id is " + id;
    }
}
