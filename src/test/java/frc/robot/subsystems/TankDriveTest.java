package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TankDriveTest {

    @Test
    public void testConstructor() {
        TankDrive subsystem = new TankDrive();
        assert subsystem.drive != null;
        assert subsystem.left != null;
        assert subsystem.right != null;
    }

    @Test
    public void testSendDriveSignal() {
        TankDrive subsystem = new TankDrive();
        subsystem.drive = mock(DifferentialDrive.class);
        subsystem.sendDriveSignal(0.3, 0.4);
        verify(subsystem.drive).tankDrive(0.3, 0.4);
    }
}
