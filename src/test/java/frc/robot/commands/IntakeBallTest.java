package frc.robot.commands;

import frc.robot.subsystems.Intake;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class IntakeBallTest {

    public static final double INTAKE_SPEED = 0.254;

    @Test
    public void testConstructor() {
        Intake mockSubsystem = mock(Intake.class);
        IntakeBall testCommand = new IntakeBall(mockSubsystem, INTAKE_SPEED);
        assert testCommand.intake.equals(mockSubsystem);
        assert testCommand.speed == INTAKE_SPEED;
        assert testCommand.getRequirements().contains(mockSubsystem);
    }

    @Test
    public void testExecute() {
        Intake mockSubsystem = mock(Intake.class);
        IntakeBall testCommand = new IntakeBall(mockSubsystem, INTAKE_SPEED);
        verify(mockSubsystem).spinIntake(INTAKE_SPEED);
    }
}
