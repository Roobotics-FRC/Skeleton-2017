package org.usfirst.frc.team4373.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4373.robot.OI;
/**
 * Created by tesla on 10/22/16.
 */

public abstract class CommandBase extends Command {
    protected OI oi;

    public CommandBase() {
        super();
        this.oi = OI.getOI();
    }
}
