import lejos.nxt.*;
import lejos.util.*;
public class LSLTester
{
    public static void main (String[] args)
    {
        LCD.drawString("Light",0,0);
        Button.waitForAnyPress();
        LCD.clear();
        LightSensorListener list = new LightSensorListener();
        SensorPort.S1.addSensorPortListener(list);
        Button.ESCAPE.waitForAnyPress();
    }
}
