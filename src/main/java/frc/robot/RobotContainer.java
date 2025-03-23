// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.Commands.ArcadeDrive;
import frc.robot.Subsystems.DriveSubsystem;

public class RobotContainer {

  private final DriveSubsystem drivesub = new DriveSubsystem();

  private final Joystick driveJoystick1 = new Joystick(0);

  public RobotContainer() {
    
    drivesub.setDefaultCommand(
          new ArcadeDrive(drivesub, () -> driveJoystick1.getRawAxis(1), () -> driveJoystick1.getRawAxis(3)));

    configureBindings();
  }

  private void configureBindings() {}

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
