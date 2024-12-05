package com.spartronics4915.frc2025.Util;

import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

public final record MotorConstants(
            int motorID,
            MotorType motorType,
            boolean motorIsInverted,
            IdleMode idleMode,
            int currentLimit
) {}
