import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.robotics.navigation.DifferentialPilot;
/**
 * Write a description of class SquareTracer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SquareTracer
{
    public void traceSquare()
    {
        //DifferentialPilot(float wheelDiameter, float trackWidth, Motor leftMotor, Motor rightMotor)
        DifferentialPilot pilot= new DifferentialPilot(5,10,Motor.A,Motor.B);
        int i=0;
        while (i<=3)
        {
            
        pilot.travel(5);
        Motor.A.rotate(90,false);
    }

    }
}
