/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class TankDrive extends SubsystemBase {

    DifferentialDrive drive;
    WPI_TalonSRX left; //CAN ID 0
    WPI_TalonSRX right; //CAN ID 1

    /**
     * Creates a new ExampleSubsystem.
     */
    public TankDrive() {

    }

    public void sendDriveSignal(double left, double right) {

    }

    /**
     * Will be called periodically whenever the CommandScheduler runs.
     */
    @Override
    public void periodic() {

    }
}
