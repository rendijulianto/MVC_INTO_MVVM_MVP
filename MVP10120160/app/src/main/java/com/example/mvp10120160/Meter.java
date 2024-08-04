package com.example.mvp10120160;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class Meter {
    private double meter;

    public void setMeter(double meter) {
        this.meter = meter;
    }

    public double toKilometer() {
        return meter / 1000;
    }

    public double toCentimeter() {
        return meter * 100;
    }
}