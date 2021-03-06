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
    public static AnalogInput driveTrainUltrasonic;
    public static Gyro driveTrainGyro1;
    public static SpeedController driveTrainFrontRightoutput2;
    public static SpeedController driveTrainfrontleftoutput3;
    public static SpeedController driveTrainbackrighoutput4;
    public static SpeedController driveTrainbackleftoutput5;
    public static RobotDrive driveTrainRobotDrive41;
    public static Compressor grabCompressor;
    public static DoubleSolenoid grabRightSolenoid;
    public static DoubleSolenoid grableftSolenoid;
    public static SpeedController manualliftliftmotor;
    public static DigitalInput manualliftLimitSwitchtop;
    public static DigitalInput manualliftLimitSwitchbottom;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainUltrasonic = new AnalogInput(2);
        LiveWindow.addSensor("Drive Train", "Ultrasonic", driveTrainUltrasonic);
        
        driveTrainGyro1 = new Gyro(1);
        LiveWindow.addSensor("Drive Train", "Gyro 1", driveTrainGyro1);
        driveTrainGyro1.setSensitivity(0.007);
        driveTrainFrontRightoutput2 = new Talon(6);
        LiveWindow.addActuator("Drive Train", "Front Right output 2", (Talon) driveTrainFrontRightoutput2);
        
        driveTrainfrontleftoutput3 = new Talon(7);
        LiveWindow.addActuator("Drive Train", "front left  output 3", (Talon) driveTrainfrontleftoutput3);
        
        driveTrainbackrighoutput4 = new Talon(8);
        LiveWindow.addActuator("Drive Train", "back righ output 4", (Talon) driveTrainbackrighoutput4);
        
        driveTrainbackleftoutput5 = new Talon(9);
        LiveWindow.addActuator("Drive Train", "back left output 5", (Talon) driveTrainbackleftoutput5);
        
        driveTrainRobotDrive41 = new RobotDrive(driveTrainfrontleftoutput3, driveTrainbackleftoutput5,
              driveTrainFrontRightoutput2, driveTrainbackrighoutput4);
        
        driveTrainRobotDrive41.setSafetyEnabled(true);
        driveTrainRobotDrive41.setExpiration(0.1);
        driveTrainRobotDrive41.setSensitivity(0.5);
        driveTrainRobotDrive41.setMaxOutput(1.0);

        driveTrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        driveTrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        grabCompressor = new Compressor(0);
        
        
        grabRightSolenoid = new DoubleSolenoid(0, 0, 1);      
        LiveWindow.addActuator("grab", "Right Solenoid", grabRightSolenoid);
        
        grableftSolenoid = new DoubleSolenoid(0, 2, 3);      
        LiveWindow.addActuator("grab", "left Solenoid", grableftSolenoid);
        
        manualliftliftmotor = new Victor(1);
        LiveWindow.addActuator("manual lift", "lift motor", (Victor) manualliftliftmotor);
        
        manualliftLimitSwitchtop = new DigitalInput(2);
        LiveWindow.addSensor("manual lift", "Limit Switch top", manualliftLimitSwitchtop);
        
        manualliftLimitSwitchbottom = new DigitalInput(3);
        LiveWindow.addSensor("manual lift", "Limit Switch bottom", manualliftLimitSwitchbottom);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
