package frc.robot;

import frc.robot.commands.JoystickDrive;
import org.junit.jupiter.api.Test;

public class RobotContainerTest {

    @Test
    public void testConstructor() {
        RobotContainer robotContainer = new RobotContainer();
        assert robotContainer.tankDrive != null;
        assert robotContainer.tankDrive.getDefaultCommand() instanceof JoystickDrive;
    }
}
