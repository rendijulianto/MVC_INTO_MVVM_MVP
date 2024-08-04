package com.example.mvp10120160;

public class MainPresenter {
    private MainView view;

    public MainPresenter(MainView view) {
        this.view = view;
    }

    public void calculateDistance(String meter) {
        if (meter.isEmpty())
            meter = "0";

        Meter model = new Meter();
        double parsedMeter = Double.parseDouble(meter);
        model.setMeter(parsedMeter);

        String kilometer = model.toKilometer() + "";
        String centimeter = model.toCentimeter() + "";

        view.showKilometer(kilometer);
        view.showCentimeter(centimeter);
    }
}
