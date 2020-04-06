package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import frc.robot.subsystems.TankDrive;

import static org.mockito.Mockito.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class JoystickDriveTest {

    private final double LEFT_DRIVE_SIGNAL = 0.5;
    private final double RIGHT_DRIVE_SIGNAL = 0.2;

    @Test
    public void testConstructor() {
        TankDrive subsystem = mock(TankDrive.class);
        XboxController controller = mock(XboxController.class);
        JoystickDrive command = new JoystickDrive(subsystem, controller);
        assert command.getRequirements().contains(subsystem);
        assert command.controller == controller;
        assert command.subsystem == subsystem;

    }

    @Test
    public void testExecute() {
        TankDrive subsystem = mock(TankDrive.class);
        XboxController controller = mock(XboxController.class);
        when(controller.getRawAxis(0)).thenReturn(LEFT_DRIVE_SIGNAL);
        when(controller.getRawAxis(1)).thenReturn(RIGHT_DRIVE_SIGNAL);

        JoystickDrive command = new JoystickDrive(subsystem, controller);
        command.execute();

        verify(subsystem).sendDriveSignal(LEFT_DRIVE_SIGNAL, RIGHT_DRIVE_SIGNAL);
    }


}
