package ru.gw3nax.hw16.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class MemoryController {

    @GetMapping("/stack-overflow")
    public String stackOverflow() {
        return recursiveCall();
    }

    @GetMapping("/out-of-memory")
    public String outOfMemory() {

        try {
            List<Integer[]> memoryLeak = new ArrayList<>();
            while (true) {
                memoryLeak.add(new Integer[Integer.MAX_VALUE]);
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    private String recursiveCall() {
        return recursiveCall();
    }
}
