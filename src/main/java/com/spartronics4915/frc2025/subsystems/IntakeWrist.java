package com.spartronics4915.frc2025.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.spartronics4915.frc2025.Constants.OperatorConstants;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeWrist extends SubsystemBase {
    
    private CANSparkMax mMotor;

    public void MotorController() {
        mMotor = new CANSparkMax(OperatorConstants.kMotorid, MotorType.kBrushless);
    }

    public Command setMotorSpeedCommand(double pcgt) {
        return Commands.runOnce(() -> {
            mMotor.set(pcgt);
        });
    }
}