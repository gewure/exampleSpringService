package myservice.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomAPI {

    // here we are being lazy and doing service-layer stuff in the web-layer
    // goodpractice would be to make a RandomService.java in /service package
    // and inject it into this API-Controller ((look at HelloWorldAPI how this is done))
    @RequestMapping(value = "/random")
    public int giveRandom() {

        int min = 0;
        int max = 100000;

        return min + (int)(Math.random() * ((max - min) + 1));
    }

}
