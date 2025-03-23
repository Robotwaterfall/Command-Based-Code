// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConstants;

public class IntakeSubsystem extends SubsystemBase {

  //Creates the intake motor
  private final SparkMax IntakeMotor = new SparkMax(IntakeConstants.kIntakeMotorPort, MotorType.kBrushless);

  public void setMotors(Double speed){
    IntakeMotor.set(IntakeConstants.kIntakeMotorSpeed);
  }

   

}
