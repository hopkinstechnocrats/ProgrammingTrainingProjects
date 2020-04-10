package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class IntakeTest {

    public static final double INTAKE_MOTOR_SPIN_SPEED = 0.35;

    @Test
    public void testConstructor() {
        Intake intake = new Intake();
        assert intake.motor != null;
        assert intake.motor.getDeviceID() == 2;
    }

    @Test
    public void testSpinIntake() {
        Intake intake = new Intake();
        WPI_TalonSRX mockMotor = mock(WPI_TalonSRX.class);
        intake.motor = mockMotor;
        intake.spinIntake(INTAKE_MOTOR_SPIN_SPEED);
        verify(mockMotor).set(INTAKE_MOTOR_SPIN_SPEED);
    }
}
