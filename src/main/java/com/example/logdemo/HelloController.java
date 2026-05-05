package com.example.logdemo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class HelloController {
//    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String sayHello() {
        String name = "Ark";
        log.info("Received request for /hello :{}",name);
        log.trace("TRACE: LOG");
        log.warn("WARN: LOG");
        log.error("ERROR: LOG");
        return "Hello World!";
    }
}
