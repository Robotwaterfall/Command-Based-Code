// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Commands.ArcadeDriveCMD;
import frc.robot.Commands.ClimberCMD;
import frc.robot.Commands.IntakeCMD;
import frc.robot.Constants.OIConstants;
import frc.robot.Subsystems.ClimberSubsystem;
import frc.robot.Subsystems.DriveSubsystem;
import frc.robot.Subsystems.IntakeSubsystem;

public class RobotContainer {

  //Creates a new DriveSubsystem
  private final DriveSubsystem drivesub = new DriveSubsystem();

  //Creates a new ClimberSubsystem
  private final ClimberSubsystem climbSub = new ClimberSubsystem();

  //Creates a new IntakeSubsystem
  private final IntakeSubsystem intakesub = new IntakeSubsystem();

  //Creates a controller
  private final Joystick driveJoystick1 = new Joystick(OIConstants.kControllerPort);

  public RobotContainer() {
    
    //get the axis of the controller to control motors
    drivesub.setDefaultCommand(
          new ArcadeDriveCMD(drivesub, () -> driveJoystick1.getRawAxis(1), () -> driveJoystick1.getRawAxis(3)));

    configureBindings();
  }

  private void configureBindings(){
    //Button that makes the climber climb
    new JoystickButton(driveJoystick1, OIConstants.kclimbButton).whileTrue(new ClimberCMD(climbSub, OIConstants.ksetSetpoint));
    //Button that makes the climber un-climb
    new JoystickButton(driveJoystick1, OIConstants.kunClimbButton).whileTrue(new ClimberCMD(climbSub, OIConstants.kunClimbsetpoint));
    //Button that makes the intake start
    new JoystickButton(driveJoystick1, OIConstants.kIntakeButton).whileTrue(new IntakeCMD(intakesub, OIConstants.ksetIntakeSpeed));
    //Button that makes the outtake start
    new JoystickButton(driveJoystick1, OIConstants.kOuttakeButton).whileTrue(new IntakeCMD(intakesub, OIConstants.ksetOuttakeSpeed));
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
