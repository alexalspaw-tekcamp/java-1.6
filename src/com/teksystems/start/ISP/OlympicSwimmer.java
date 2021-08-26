package com.teksystems.start.ISP;

public class OlympicSwimmer implements Athlete {
    @Override
    public void compete() {
        System.out.println("The swimmer begins competing.");
    }

    @Override
    public void swim() {
        System.out.println("Start swimming");
    }

    @Override
    public void highJump() {
        // unimplemented
    }

    @Override
    public void longJump() {
        // unimplemented
    }
}
