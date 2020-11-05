package com.javalesson.inheritance;

public class Auto {

    private String producer;
    private String model;
    private EngineType engineType;
    private int currentSpeed;
    boolean isRunning;

    public Auto(String producer, String model, EngineType engineType) {
        this.producer = producer;
        this.model = model;
        this.engineType = engineType;
    }

    public void start() {
        isRunning= true;
        currentSpeed = 10;
        System.out.println("Auto is starting");
    }

    public void stop() {
        isRunning=false;
        currentSpeed=0;
        System.out.println("Auto is stopped");
    }

    public void acccelerate(int kmPerHout){
        currentSpeed+=kmPerHout;
        System.out.println("Current Speed is"+currentSpeed+"kmPerHout");
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
