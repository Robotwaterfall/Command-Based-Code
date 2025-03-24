// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.IntakeSubsystem;


public class IntakeCMD extends Command {

  private final IntakeSubsystem intakesub;

  private final double speed;
 
  public IntakeCMD(IntakeSubsystem intakesub, double speed) {
   this.intakesub = intakesub;
   this.speed = speed;
   addRequirements(intakesub);
  }
 
  @Override
  public void initialize() {
    System.out.println("intake has been initialized");
    
  }

  @Override
  public void execute() {
    intakesub.setMotors(speed);
  }

  @Override
  public void end(boolean interrupted) {
    System.out.println("intake has been terminated");
  }


  @Override
  public boolean isFinished() {
    return false;
  }
}
