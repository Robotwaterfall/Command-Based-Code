// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.DriveSubsystem;


public class ArcadeDrive extends Command {

  private final DriveSubsystem drivesub;
  private final Supplier <Double> speedFunction, turnFunction;
  
  public ArcadeDrive(DriveSubsystem drivesub, Supplier <Double> speedFunction, Supplier <Double> turnFunction) {
    this.drivesub = drivesub;
    this.speedFunction = speedFunction;
    this.turnFunction = turnFunction;
    addRequirements(drivesub);
  }

  
  @Override
  public void initialize() {
    System.out.println("Arcade drive has been initialized");
  }

  
  @Override
  public void execute() {
    double realTimeSpeed = speedFunction.get();
    double realTimeTurn = turnFunction.get();

    double left = realTimeSpeed + realTimeTurn;
    double right = realTimeSpeed - realTimeTurn;
    drivesub.setMotors(left, right);
  }

  
  @Override
  public void end(boolean interrupted) {
    System.out.println("Arcade drive has been interrupted");
    drivesub.setMotors(0, 0);
  }

  
  @Override
  public boolean isFinished() {
    return false;
  }
}
