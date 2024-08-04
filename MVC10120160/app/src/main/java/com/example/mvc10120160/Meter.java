package com.example.mvc10120160;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class Meter {
    private static Meter instance;

    private double meter;

    private MutableLiveData<String> kilometer;
    private MutableLiveData<String> centimeter;

    private Meter() {
        this.meter = 0;
        this.kilometer = new MutableLiveData<>();
        this.centimeter = new MutableLiveData<>();
    }

    public static synchronized Meter getInstance() {
        if (instance == null) {
            instance = new Meter();
        }

        return instance;
    }

    public static void destroy() {
        instance = null;
    }

    public LiveData<String> getKilometer() {
        return kilometer;
    }

    public LiveData<String> getCentimeter() {
        return centimeter;
    }

    public void setMeter(double meter) {
        this.meter = meter;
    }

    public void toKilometer() {
        this.kilometer.setValue(meter / 1000 + "");
    }

    public void toCentimeter() {
        this.centimeter.setValue(meter * 100 + "");
    }
}
