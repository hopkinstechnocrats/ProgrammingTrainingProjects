package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;


public class IntakeBall extends CommandBase {
    public Intake intake;
    public double speed;

    public IntakeBall(Intake intake, double speed) {
        //set the instance variables this.intake and this.speed;
        //add intake to the requirements for this command. Hint: use the method addRequirements();
    }

    @Override
    public void execute() {

    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
