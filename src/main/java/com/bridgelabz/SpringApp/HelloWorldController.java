package com.bridgelabz.SpringApp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class HelloWorldController {
    @PostMapping("/greet")
    public String getMessage() {
        return "Hello from Bridgelabz";
    }

    @RequestMapping(value = {"/", "/hello", "message"})
    public String getHelloMessage() {
        return "Hello BridgeLabz";
    }

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String test1(@RequestParam String fname, @RequestParam String lname) {
        return "Hello : " + fname + " " + lname;
    }

    @RequestMapping(value = "/test2/{name}", method = RequestMethod.GET)
    public String test2(@PathVariable String name) {
        return "Hello : " + name;
    }

    @RequestMapping(value = "/test3/{name}", method = RequestMethod.GET)
    public String test3(
            @RequestParam(name = "firstName") String anything
    ) {
        return anything;
    }

    @RequestMapping(value = "/test4", method = RequestMethod.PUT)
    public Student test4(@RequestBody Student student) {
        System.out.println(student.toString());
        return student;
    }

    @RequestMapping(value = "/test5", method = RequestMethod.PUT)
    public Student test5(@RequestBody Student student) {
        log.info(student.toString());
        return student;
    }

}
