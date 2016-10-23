package org.usfirst.frc.team4373.robot;

/**
 * Created by tesla on 10/22/16.
 */
public class OI {
    private static OI oi = null;

    public static OI getOI() {
        oi = oi == null ? new OI() : oi;
        return oi;
    }
}
