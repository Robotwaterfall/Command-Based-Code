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
        public final static int kunClimbsetpoint = 0;
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
    
}
