// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4919.Robot_2015.subsystems;

import org.usfirst.frc4919.Robot_2015.RobotMap;
import org.usfirst.frc4919.Robot_2015.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.*;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 *
 */
public class Lift extends PIDSubsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    DigitalInput limitSwitchbottom = RobotMap.liftLimitSwitchbottom;
    DigitalInput limitSwitchtop = RobotMap.liftLimitSwitchtop;
    AnalogInput lift10turnpot = RobotMap.liftlift10turnpot;
    SpeedController liftmotor = RobotMap.liftliftmotor;
    Counter countertop = new Counter(limitSwitchtop);
    Counter counterbottom = new Counter(limitSwitchbottom);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // Initialize your subsystem here
    public Lift() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PID
        super("Lift", 6.0, 0.0, 0.0);
        setAbsoluteTolerance(0.05);
        getPIDController().setContinuous(false);
        LiveWindow.addActuator("Lift", "PIDSubsystem Controller", getPIDController());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PID

        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
    }
    
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;

        return lift10turnpot.getAverageVoltage();
        //delete auto generated code comment
    }
    
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=OUTPUT
        liftmotor.pidWrite(output);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=OUTPUT
    }
    public boolean isSwitchSettop() {
        return countertop.get() > 0;
    }

    public void initializeCountertop() {
        countertop.reset();
    }
    
    //                                      //
    public boolean isSwitchSetbottom() {
        return counterbottom.get() > 0;
    }

    public void initializeCounterbottom() {
        counterbottom.reset();
    }
}

