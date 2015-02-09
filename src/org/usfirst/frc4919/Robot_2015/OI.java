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

import org.usfirst.frc4919.Robot_2015.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton button1;
    public Joystick joystick1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        joystick1 = new Joystick(0);
        
        button1 = new JoystickButton(joystick1, 1);
        button1.whileHeld(new Liftcommand());

	    
        // SmartDashboard Buttons
        SmartDashboard.putData("Lift command", new Liftcommand());

        SmartDashboard.putData("automous", new automous());

        SmartDashboard.putData("mechaum drive", new mechaumdrive());

        SmartDashboard.putData("open grabber", new opengrabber());

        SmartDashboard.putData("close grabber", new closegrabber());

        SmartDashboard.putData("lift tote trash", new lifttotetrash());

        SmartDashboard.putData("wait 2 seconds", new wait2seconds());

        SmartDashboard.putData("wait 4 seconds", new wait4seconds());

        SmartDashboard.putData("Command Group 1", new CommandGroup1());

        SmartDashboard.putData("Command Group 2", new CommandGroup2());

        SmartDashboard.putData("Command Group 3", new CommandGroup3());

        SmartDashboard.putData("Command Group 4", new CommandGroup4());

        SmartDashboard.putData("grab floor tote height", new grabfloortoteheight());

        SmartDashboard.putData("grab platform tote height", new grabplatformtoteheight());

        SmartDashboard.putData("Grab step tote height", new Grabsteptoteheight());

        SmartDashboard.putData("Cary tote height", new Carytoteheight());

        SmartDashboard.putData("Stack tote height on floor", new Stacktoteheightonfloor());

        SmartDashboard.putData("Stack tote height on step", new Stacktoteheightonstep());

        SmartDashboard.putData("Stack tote height on platform", new Stacktoteheightonplatform());

        SmartDashboard.putData("Set down tote on floor height", new Setdowntoteonfloorheight());

        SmartDashboard.putData("Set down tote on platform height", new Setdowntoteonplatformheight());

        SmartDashboard.putData("Set down tote on step height", new Setdowntoteonstepheight());

        SmartDashboard.putData("Grab floor can height", new Grabfloorcanheight());

        SmartDashboard.putData("Grab step can height", new Grabstepcanheight());

        SmartDashboard.putData("Carry can height", new Carrycanheight());

        SmartDashboard.putData("Stack can on top of 4 totes height on floor", new Stackcanontopof4totesheightonfloor());

        SmartDashboard.putData("Set down can", new Setdowncan());


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick1() {
        return joystick1;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

