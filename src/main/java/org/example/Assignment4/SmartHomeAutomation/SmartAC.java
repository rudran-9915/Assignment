package org.example.Assignment4.SmartHomeAutomation;

public class SmartAC extends SmartDevice implements VoiceControl {
    @Override
    public void turnOn() {
        System.out.println("Turning on Smart AC");
    }

    @Override
    public void ControlByVoice(String command) {
        System.out.println("Smart AC controlled by voice: " + command);
    }
}
