package frc.robot;

public final class Constants {
    public final static class DriveConstants{

        //Motor Ports for the drivetrian motors.
        //TODO: change the DriveConstants motor ports
        public final static int kLeftmastermotor1port = 0;  
        public final static int kLeftmastermotor2port = 1; 
        public final static int kRightmastermotor1port = 2;
        public final static int kRightmastermotor2port = 3;
    }

    public final static class OIConstants{
        
        //Controller port
        public final static int kControllerPort = 0;

        //Button to activate the climber (TO CLIMB))
        public final static int kclimbButton = 1;
        public final static double ksetSetpoint = 125;
        //Button to activate the unclimb (TO UN-CLIMB)
        public final static int kunClimbButton = 2;
        public final static double kunClimbsetpoint = 0;

        //Button to activate the motor to go in
        public final static int kIntakeButton = 3;
        //Button to reverse the intake to spit coral out
        public final static int kOuttakeButton = 4;
        //Speed for the motor to go in
        public final static double ksetIntakeSpeed = 1;
        //Speed for the motor to go out
        public final static double ksetOuttakeSpeed = -1;

        //Button that makes the elevator go up
        public final static int kElevatorGoUpbutton = 5;
        //Button that makes the elevator return
        public final static int kElevatorReturnbutton = 6;
        //Setpoint to go to
        public final static double kElevatorSetpoint = 5;
        //Setpoint to return to
        public final static double kElevatorReturn = 0;
    }

    public final static class ClimberConstants{
        //Motor ports
        //TODO: Change the ClimberConstants Motor Ports
        public final static int kPrimaryClimberMotorPort = 4;
        public final static int kSecondaryClimberMotorPort = 5;

        //TODO: Tune PID for the Climber
        public final static double kClimberKp = 0;
        public final static double kClimberKi = 0;
        public final static double kClimberKd = 0;
    }

    public final static class IntakeConstants{
        //Motor port
        //TODO: Change the Intake motor port
        public final static int kIntakeMotorPort = 6;
    }

    public final static class ElevatorConstants{
        //Motor Ports
        //TODO: Change the Elevator motor ports
        public final static int kPrimaryElevatorMotorPort = 7;
        public final static int kSecondaryElevatorMotorPort = 8;

        //TODO: Tune PID for Elevator
        public final static double kElevatorKp = 0;
        public final static double kElevatorKi = 0;
        public final static double kElevatorKd = 0;
    }
    
}
