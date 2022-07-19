package com.company.exercise3;

import java.nio.channels.Channel;

public class Remote {
    TV tv;

    public Remote(TV tv) {
        this.tv = tv;
    }

    public void switchChannel(boolean up){
        if (tv.on == true) {
            if (up == true) {
                tv.chanel++;
                if (tv.chanel > 20) {
                    tv.chanel -= 20;
                }
            } else {
                tv.chanel--;
                if (tv.chanel <= 0) {
                    tv.chanel += 20;
                }
            }
            System.out.printf("Channel: %d\n", tv.chanel);
        }
    }

    public void switchVolume(boolean up){
        if (tv.on == true) {
            if (up == true) {
                if (tv.volume < 10) {
                    tv.volume++;
                }
            } else {
                if (tv.volume > 0) {
                    tv.volume--;
                }
            }
            System.out.printf("Volume: %d\n", tv.volume);
        }
    }

    public void turnOnOff(){
        if (tv.on == true){
            tv.on = false;
        } else {
            tv.on = true;
        }
        System.out.printf("TV is on: %b\n", tv.on);
    }
}
