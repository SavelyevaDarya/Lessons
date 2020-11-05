package com.javalesson.inheritance;

public class ElectricCar extends Auto {
    int batareVolume;



    public ElectricCar(String producer, String model, EngineType engineType) {
        super(producer, model, engineType);
    }
}