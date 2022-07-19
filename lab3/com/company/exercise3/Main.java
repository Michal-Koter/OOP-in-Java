package com.company.exercise3;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Remote remote = new Remote(tv);

        remote.switchChannel(true);
        remote.switchVolume(false);

        remote.turnOnOff();
        remote.switchChannel(true);
        remote.switchVolume(false);

        remote.switchChannel(false);
        remote.switchVolume(true);
        remote.turnOnOff();
    }
}
