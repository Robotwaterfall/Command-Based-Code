// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class DriveSubsystem extends SubsystemBase {
  
  //Left motors
  private final SparkMax Leftmastermotor1 = new SparkMax(DriveConstants.kLeftmastermotor1port, MotorType.kBrushless);
  private final SparkMax Leftmastermotor2 = new SparkMax(DriveConstants.kLeftmastermotor2port, MotorType.kBrushless);

  //Right motors
  private final SparkMax Rightmastermotor1 = new SparkMax(DriveConstants.kRightmastermotor1port, MotorType.kBrushless);
  private final SparkMax Rightmastermotor2 = new SparkMax(DriveConstants.kRightmastermotor2port, MotorType.kBrushless);

  public DriveSubsystem() {}

  public void setMotors(double leftspeed, double rightspeed){
    Leftmastermotor1.set(leftspeed);
    Leftmastermotor2.set(leftspeed);
    Rightmastermotor1.set(rightspeed);
    Rightmastermotor2.set(rightspeed);
  }

}
