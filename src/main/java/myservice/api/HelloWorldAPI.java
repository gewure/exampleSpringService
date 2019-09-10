package myservice.api;

import myservice.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldAPI {

    private final HelloWorldService service;

    @Autowired
    public HelloWorldAPI(HelloWorldService service) {
        this.service = service;
    }

    @RequestMapping(value = "/helloworld")
    public String helloWorld(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "number") int number) {

            return String.valueOf(service.calculate(number,name));
    }
}
