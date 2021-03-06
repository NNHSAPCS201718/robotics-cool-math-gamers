import lejos.nxt.*;
public class TestProgramm {
   
  public static void main(String[] args){  
     TestProgramm a = new TestProgramm ();

     a.go();
  }

  public void go (){
     MyLightListener lightListener = new MyLightListener ();
     MyTouchListener touchListener = new MyTouchListener ();
     
     LightSensor light = new LightSensor (SensorPort.S4);
     TouchSensor touch = new TouchSensor (SensorPort.S3);
     
     SensorPort.S4.addSensorPortListener(lightListener);
     SensorPort.S3.addSensorPortListener(touchListener);
     
     LCD.drawString("LightListener:", 0, 1);
     LCD.drawString("TouchListener:", 0, 4);
     Button.waitForAnyPress();
  }
  
  class MyLightListener implements SensorPortListener { 
   public void stateChanged(SensorPort source, int oldValue, int newValue) {
      LCD.drawString("alt: "+ oldValue + "   neu: " + newValue, 0, 2);

   }  
  }
  
  class MyTouchListener implements SensorPortListener {
     public void stateChanged (SensorPort source, int oldValue, int newValue){
        LCD.drawString("alt: " + oldValue + "   neu: " + newValue, 0, 5);
     }
  }
}