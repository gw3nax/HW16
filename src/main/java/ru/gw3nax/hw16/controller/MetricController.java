package ru.gw3nax.hw16.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gw3nax.hw16.service.CustomMetricService;

@RestController
public class MetricController {

    private final CustomMetricService customMetricService;

    public MetricController(CustomMetricService customMetricService) {
        this.customMetricService = customMetricService;
    }

    @GetMapping("/metric")
    public String incrementMetric() {
        customMetricService.incrementCounter();
        return "Metric incremented!";
    }
}