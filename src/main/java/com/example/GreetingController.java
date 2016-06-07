package com.example;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by mikailaakeredolu on 6/6/16.
 */

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

//The @RequestMapping annotation ensures that HTTP requests to /greeting are mapped to the greeting() method.

    @RequestMapping("/greeting")

    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){

          return new Greeting(counter.incrementAndGet(), //returning new instance of the greeting class id increases
                    String.format(template, name));


}


}
