import lejos.nxt.*;
import lejos.util.*;
public class LightSensorListener implements SensorPortListener
{
   public void stateChanged(SensorPort aSource, int aOldValue, int aNewValue)
   {
       LCD.drawString(""+aNewValue,0,0);
       //Button.waitForAnyPress();
    }
}
