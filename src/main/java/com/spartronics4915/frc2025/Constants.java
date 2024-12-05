package com.spartronics4915.frc2025;

import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.spartronics4915.frc2025.Util.MotorConstants;

public class Constants {
    public static final class IntakeWristConstants { // [ ] Intake Wrist constants
        public static final MotorConstants kMotorConstants = new MotorConstants(
            0, MotorType.kBrushless, false, IdleMode.kBrake, 40);
    }
}
