package com.example.mvc10120160;

public class MainController {
    private MainView view;
    private Meter model;

    public MainController(MainView view) {
        this.view = view;
        this.model = Meter.getInstance();
    }

    public void calculateTemperature() {
        String meter = view.getMeter();
        if (meter.isEmpty())
            meter = "0";

        double parsedMeter = Double.parseDouble(meter);
        model.setMeter(parsedMeter);

        model.toCentimeter();
        model.toKilometer();
    }
}
