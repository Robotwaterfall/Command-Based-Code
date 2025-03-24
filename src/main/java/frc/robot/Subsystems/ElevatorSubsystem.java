// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ElevatorConstants;

public class ElevatorSubsystem extends SubsystemBase {
  
  private final SparkMax PrimaryElevatorMotor = new SparkMax(ElevatorConstants.kPrimaryElevatorMotorPort, MotorType.kBrushless);
  private final SparkMax SecondaryElevatorMotor = new SparkMax(ElevatorConstants.kSecondaryElevatorMotorPort, MotorType.kBrushless);

  private final Encoder elevatorEncoder = new Encoder(4,5);

  private final double kEncoderTick2Meter = 1.0 / 4096.0 * 0.1 * Math.PI;

  public double getEncoderMeters(){
    return elevatorEncoder.get()*kEncoderTick2Meter;
  }

  public ElevatorSubsystem() {
   
  }

  @Override
  public void periodic(){
    SmartDashboard.putNumber("Elevator Endcoder Value", getEncoderMeters());
  }

  public void setMotors(double speed){
    PrimaryElevatorMotor.set(speed);
    SecondaryElevatorMotor.set(speed);
  }

  
}
