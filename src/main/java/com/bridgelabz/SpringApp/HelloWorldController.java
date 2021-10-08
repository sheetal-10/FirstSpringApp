package com.bridgelabz.SpringApp;

import org.springframework.web.bind.annotation.*;

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
}
