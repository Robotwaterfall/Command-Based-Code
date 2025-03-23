// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ClimberConstants;

public class ClimberSubsystem extends SubsystemBase {

  private final SparkMax primaryClimberMotor = new SparkMax(ClimberConstants.kPrimaryClimberMotorPort, MotorType.kBrushless);
  private final SparkMax secondaryClimberMotor = new SparkMax(ClimberConstants.kSecondaryClimberMotorPort, MotorType.kBrushless);

  private final SparkMaxConfig primaryClimberMotorConfig = new SparkMaxConfig();
  private final SparkMaxConfig secondaryClimberMotorConfig = new SparkMaxConfig();

  private final PIDController climberPidController = new PIDController(
    ClimberConstants.kClimberKp,
    ClimberConstants.kClimberKi,
    ClimberConstants.kClimberKd
  );
  public ClimberSubsystem(){
    /*right climb motor will mirror the left climb motor's movement.  */
    primaryClimberMotorConfig.
    follow(ClimberConstants.kPrimaryClimberMotorPort, true);
    /*converts rotations of the climb motor to degrees */
    primaryClimberMotorConfig.absoluteEncoder.positionConversionFactor(360);

    /*apply motor configs */
    primaryClimberMotor.configure(primaryClimberMotorConfig, ResetMode.kNoResetSafeParameters,
    PersistMode.kNoPersistParameters);

    secondaryClimberMotor.configure(secondaryClimberMotorConfig, ResetMode.kNoResetSafeParameters, 
    PersistMode.kNoPersistParameters);
}





 
public SparkMax getPrimaryClimbMotor(){
    return primaryClimberMotor;
}

public double getGetClimbEncoderPosition_degrees(){
    return primaryClimberMotor.getAbsoluteEncoder().getPosition();
}


public PIDController getClimbController(){
    return climberPidController;
}

//sets the climber motor power
public void setClimbMotorPower(double power){
    primaryClimberMotor.set(power);
}

}
