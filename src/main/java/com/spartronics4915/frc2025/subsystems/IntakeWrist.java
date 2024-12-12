package com.spartronics4915.frc2025.subsystems;

import frc.robot.subsystems

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import javax.security.auth.PrivateCredentialPermission;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import com.spartronics4915.frc2025

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeWrist extends SubsystemBase {

    public class MotorController {

        private final CANSparkMax mMotor;

        public MotorController() {
            super();

            mMotor = new CANSparkMax(0, null)

        }

    } 
}

