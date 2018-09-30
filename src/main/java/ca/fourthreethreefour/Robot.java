package ca.fourthreethreefour;

import edu.first.robot.IterativeRobotAdapter;

public class Robot extends IterativeRobotAdapter implements Constants {

    public Robot() {
        super("WiiRemote");
    }

    // Runs when the robot is enabled
    @Override
    public void init() {

    }

    // Runs right when it's disabled
    @Override
    public void initDisabled() {
        
    }

    // Runs while it's disabled
    @Override
    public void periodicDisabled() {

    }

    // Runs at the beginning of Auto
    @Override
    public void initAutonomous() {
        
    }

    // Runs during Auto
    @Override
    public void periodicAutonomous() {
        
    }

    // Runs at the end of Auto
    @Override
    public void endAutonomous() {
        
    }

    // Runs at the beginning of Teleop
    @Override
    public void initTeleoperated() {
        
    }

    // Runs during Teleop
    @Override
    public void periodicTeleoperated() {
        
    }

    // Runs at the end of Teleop
    @Override
    public void endTeleoperated() {
        
    }
}