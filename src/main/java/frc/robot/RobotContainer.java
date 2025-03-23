// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Commands.ArcadeDrive;
import frc.robot.Constants.OIConstants;
import frc.robot.Subsystems.DriveSubsystem;

public class RobotContainer {

  //Creates a new DriveSubsystem
  private final DriveSubsystem drivesub = new DriveSubsystem();

  //Creates a controller
  private final Joystick driveJoystick1 = new Joystick(OIConstants.kControllerPort);

  public RobotContainer() {
    
    //get the axis of the controller to control motors
    drivesub.setDefaultCommand(
          new ArcadeDrive(drivesub, () -> driveJoystick1.getRawAxis(1), () -> driveJoystick1.getRawAxis(3)));

    configureBindings();
  }

  private void configureBindings() {}

  public Command getAutonomousCommand() {
    return null;
  }
}
