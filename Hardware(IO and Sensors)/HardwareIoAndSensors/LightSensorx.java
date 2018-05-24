import lejos.nxt.*;
import lejos.util.*;
import lejos.nxt.LightSensor;
/**
 * Write a description of class LightSensor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LightSensorx
{
    public static void main(String[] args)
    {   
        LCD.drawString("Light Sensor",0,0);
        Button.waitForAnyPress();
        LCD.clear();
        LightSensor sense = new LightSensor(SensorPort.S4);
        while(!Button.ESCAPE.isDown())
        {
            LCD.drawString("" + sense.readValue(),0,0);
            Delay.msDelay(200);
        }
        
    }
}
