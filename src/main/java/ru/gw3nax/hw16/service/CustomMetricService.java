package ru.gw3nax.hw16.service;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Service;

@Service
public class CustomMetricService {

    private final Counter requestCounter;

    public CustomMetricService(MeterRegistry meterRegistry) {
        this.requestCounter = meterRegistry.counter("custom_requests_total");
    }

    public void incrementCounter() {
        requestCounter.increment();
    }
}
