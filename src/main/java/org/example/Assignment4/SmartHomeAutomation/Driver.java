package org.example.Assignment4.SmartHomeAutomation;

public class Driver {
    public static void main(String[] args) {
        SmartLight smartLight = new SmartLight();
        smartLight.turnOn();
        smartLight.ControlByVoice("'Turn on the lights'");
        System.out.println();
        SmartAC smartAC = new SmartAC();
        smartAC.turnOn();
        smartAC.ControlByVoice("'Set temperature to 22 degree C'");
    }
}
