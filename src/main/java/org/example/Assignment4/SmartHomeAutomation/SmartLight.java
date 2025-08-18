package org.example.Assignment4.SmartHomeAutomation;

public class SmartLight extends SmartDevice implements VoiceControl{
    @Override
    public void turnOn() {
        System.out.println("Turning on Smart light");
    }

    @Override
    public void ControlByVoice(String command) {
        System.out.println("Smart Light Controlled by Voice : "+command);
    }
}
