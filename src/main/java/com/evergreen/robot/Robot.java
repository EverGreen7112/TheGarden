/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package com.evergreen.robot;

import com.evergreen.everlib.shuffleboard.loggables.DashboardStreams;
import com.evergreen.everlib.structure.Tree;
import com.evergreen.everlib.subsystems.motors.subsystems.MotorSubsystem;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.PrintCommand;

/**
 * This is the class representing our robot!
 * <p>
 * It contains each of its subsystems, and the code it runs at each stage of the game.
 * <p>
 * created and constructed in {@link Main} - The code actually ran.
 * The DriverStation will call each game stage corresponding <code>init()</code> method at its start,
 * and then repeatedly call its <code>periodic()</code> method. 
 * <p>
 * <b>Note That these methods aren't overriden in here, and it is preferable to only use the supplied {@link Tree} methods for
 * organizing the robot code.</b>
 */
public class Robot extends Tree implements SubsystemComponents {

  // Declare subsystems
  
  // public static final MotorSubsystem subsystemA = new MotorSubsystem(...);
  // public static final MotorSubsystem subsystemB = new MotorSubsystem(...);

  // public static final PistonSubsystem subsystemC = new PistonSubsystem(..);

  // public static final DriveTank chassis = new DriveTank(...);
  
  // public static final F310Gamepad joystickButton = new F310Gamepad(...)
  // public static final ExtremeProJoystick joystickLeft = new Joystick(...)
  // public static final ExtremeProJoystick joystickRight = new Joystick(...)


  // public final NetworkTable imageProccesing = NetworkTableInstance.getDefault().getTable("...");

  @Override
  protected void constantOrganize() {
    // DashboardConstant.move(...);
  } 

  @Override
  protected void commandConfig() {
    //subsystem.setDefaultCommand(...);
  }

  @Override
  protected void log() {
    // DashboardStreams.addLoggable(...);
    // DashboardStreams.addDouble(...)
  }

  @Override
  protected void initState() {
    // subsystem configurations...

  }

  @Override
  protected void autoConfig() {
    // subsystem configurations for enabled

  }

  @Override
  protected void teleopConfig() {
    // subsystem.setDefaultCommand(...)
  }

  @Override
  protected void bindButtons() {
    // joystickButton.getButton(F310.X).whenPressed(...)

  }


}
