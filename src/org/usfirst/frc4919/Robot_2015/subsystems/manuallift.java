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

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class manuallift extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController liftmotor = RobotMap.manualliftliftmotor;
    DigitalInput limitSwitchtop = RobotMap.manualliftLimitSwitchtop;
    DigitalInput limitSwitchbottom = RobotMap.manualliftLimitSwitchbottom;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    
    static double SPEEDCONSTANT = 0.6;
    static double STEADY = 0.3; 
    Counter countertop = new Counter(limitSwitchtop);
    Counter counterbottom = new Counter(limitSwitchbottom);
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    
    
    }
    
    public boolean isSwitchSet()
    {
    	
    	return ( countertop.get() > 0 || counterbottom.get() > 0);
    
    }
    public boolean isSwitchSettop() {
            
    	return countertop.get() > 0;
            
    }
    
    public boolean isSwitchSetbottom() {
        
    	return counterbottom.get() > 0;
    }
    
    public void steady() {
    	liftmotor.set(STEADY);
    }
    public void liftup() {
    	liftmotor.set(SPEEDCONSTANT);
    };
    
    public void liftdown() {
    	liftmotor.set(-0.1);
    }
    
    public void stop() {
    	liftmotor.set(0.0);
    }

public void initializeCounter() {
    countertop.reset();
    counterbottom.reset();
}

}


