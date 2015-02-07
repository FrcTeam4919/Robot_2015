// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4919.Robot_2015;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Gyro driveTrainGyro1;
    public static SpeedController driveTrainFrontRightoutput2;
    public static SpeedController driveTrainfrontleftoutput3;
    public static SpeedController driveTrainbackrighoutput4;
    public static SpeedController driveTrainbackleftoutput5;
    public static RobotDrive driveTrainRobotDrive41;
    public static Compressor grabCompressor;
    public static DoubleSolenoid grabRightSolenoid;
    public static DoubleSolenoid grableftSolenoid;
    public static AnalogInput liftlift10turnpot;
    public static SpeedController liftliftmotor;
    public static AnalogPotentiometer liftliftPotentiometer;
    public static Ultrasonic autosensorsUltrasonic1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainGyro1 = new Gyro(1);
        LiveWindow.addSensor("Drive Train", "Gyro 1", driveTrainGyro1);
        driveTrainGyro1.setSensitivity(0.007);
        driveTrainFrontRightoutput2 = new Talon(2);
        LiveWindow.addActuator("Drive Train", "Front Right output 2", (Talon) driveTrainFrontRightoutput2);
        
        driveTrainfrontleftoutput3 = new Talon(3);
        LiveWindow.addActuator("Drive Train", "front left  output 3", (Talon) driveTrainfrontleftoutput3);
        
        driveTrainbackrighoutput4 = new Talon(4);
        LiveWindow.addActuator("Drive Train", "back righ output 4", (Talon) driveTrainbackrighoutput4);
        
        driveTrainbackleftoutput5 = new Talon(5);
        LiveWindow.addActuator("Drive Train", "back left output 5", (Talon) driveTrainbackleftoutput5);
        
        driveTrainRobotDrive41 = new RobotDrive(driveTrainfrontleftoutput3, driveTrainbackleftoutput5,
              driveTrainFrontRightoutput2, driveTrainbackrighoutput4);
        
        driveTrainRobotDrive41.setSafetyEnabled(true);
        driveTrainRobotDrive41.setExpiration(0.1);
        driveTrainRobotDrive41.setSensitivity(0.5);
        driveTrainRobotDrive41.setMaxOutput(1.0);

        grabCompressor = new Compressor(0);
        
        
        grabRightSolenoid = new DoubleSolenoid(0, 0, 1);      
        LiveWindow.addActuator("grab", "Right Solenoid", grabRightSolenoid);
        
        grableftSolenoid = new DoubleSolenoid(1, 2, 3);      
        LiveWindow.addActuator("grab", "left Solenoid", grableftSolenoid);
        
        liftlift10turnpot = new AnalogInput(0);
        LiveWindow.addSensor("Lift", "lift 10 turn pot", liftlift10turnpot);
        
        liftliftmotor = new Victor(1);
        LiveWindow.addActuator("Lift", "lift motor", (Victor) liftliftmotor);
        
        liftliftPotentiometer = new AnalogPotentiometer(2, 1.0, 0.0);
        LiveWindow.addSensor("Lift", "lift Potentiometer", liftliftPotentiometer);
        
        autosensorsUltrasonic1 = new Ultrasonic(0, 1);
        LiveWindow.addSensor("auto sensors", "Ultrasonic 1", autosensorsUltrasonic1);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
