package ru.gw3nax.hw16.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
public class LoggingController {

    @GetMapping("/log")
    public String logExample() {
        var id = UUID.randomUUID().toString();
        MDC.putCloseable("Id", id);
        log.info("Structured log with custom field");
        return "Log sent!";
    }
}
