package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.IntakeBall;
import frc.robot.commands.JoystickDrive;
import frc.robot.subsystems.Intake;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.*;

public class RobotContainerTest {

    @Test
    public void testConstructor() {
        RobotContainer robotContainer = new RobotContainer();
        assert robotContainer.tankDrive != null;
        assert robotContainer.tankDrive.getDefaultCommand() instanceof JoystickDrive;
        assert robotContainer.controller != null;

    }

    @Test
    public void testConfigureButtonBindings() {
        RobotContainer robotContainer = new RobotContainer();
        robotContainer.controller = mock(XboxController.class);
        JoystickButton mockButton = mock(JoystickButton.class);
        robotContainer.intakeButton = mockButton;
        robotContainer.configureButtonBindings();
        ArgumentCaptor<IntakeBall> argument = ArgumentCaptor.forClass(IntakeBall.class);
        verify(mockButton).whileHeld(argument.capture());
        assert argument.getValue() != null;
    }
}
