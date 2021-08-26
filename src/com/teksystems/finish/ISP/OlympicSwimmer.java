package com.teksystems.finish.ISP;

public class OlympicSwimmer implements SwimmingAthlete {
    @Override
    public void compete() {
        System.out.println("started competing");
    }

    @Override
    public void swim() {
        System.out.println("started swimming");
    }
}
