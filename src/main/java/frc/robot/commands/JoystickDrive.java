/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.TankDrive;
import edu.wpi.first.hal.HAL;

import java.lang.Object;

/**
 * An example command that uses an example subsystem.
 */
public class JoystickDrive extends CommandBase {
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField", "FieldCanBeLocal"})
    TankDrive subsystem;
    XboxController controller;

    /**
     * Creates a new ExampleCommand.
     *
     * @param subsystem The subsystem used by this command.
     */
    public JoystickDrive(TankDrive subsystem, XboxController controller) {
        this.controller = controller;
        this.subsystem = subsystem;
        addRequirements(subsystem);
    }

    @Override
    public void execute() {
        subsystem.sendDriveSignal(controller.getRawAxis(0), controller.getRawAxis(1));
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
