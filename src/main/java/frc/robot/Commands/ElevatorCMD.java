// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.ElevatorConstants;
import frc.robot.Subsystems.ElevatorSubsystem;


public class ElevatorCMD extends Command {

  private final ElevatorSubsystem elevatorsub;
  private final PIDController elevatorController;

  public ElevatorCMD(ElevatorSubsystem elevatorsub, double setpoint) {
    this.elevatorsub = elevatorsub;
    this.elevatorController = new PIDController(
      ElevatorConstants.kElevatorKp,
      ElevatorConstants.kElevatorKi,
      ElevatorConstants.kElevatorKd);
    elevatorController.setSetpoint(setpoint);
    addRequirements(elevatorsub);
  }

  @Override
  public void initialize() {
    System.out.println("Elevator has been initialized");
    elevatorController.reset();
  }

  @Override
  public void execute() {
    double speed = elevatorController.calculate(elevatorsub.getEncoderMeters());
    elevatorsub.setMotors(speed);
  }

  @Override
  public void end(boolean interrupted) {
    System.out.println("Elevator has been terminated");
    elevatorsub.setMotors(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
