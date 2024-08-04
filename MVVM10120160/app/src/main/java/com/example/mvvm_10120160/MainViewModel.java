package com.example.mvvm_10120160;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private final MutableLiveData<Meter> meter;

    public MainViewModel() {
        meter = new MutableLiveData<>();
    }

    public LiveData<Meter> getMeter() {
        return meter;
    }

    public void setMeter(String stringMeter) {
        if (stringMeter.isEmpty())
            stringMeter = "0";

        double parsedMeter = Double.parseDouble(stringMeter);

        Meter meter = new Meter();
        meter.setMeter(parsedMeter);

        this.meter.setValue(meter);
    }
}
