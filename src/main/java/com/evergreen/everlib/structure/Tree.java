package com.evergreen.everlib.structure;

import com.evergreen.everlib.CommandEG;
import com.evergreen.everlib.shuffleboard.loggables.DashboardStreams;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * Tree
 */
public abstract class Tree extends TimedRobot {

    /**Runs once when the robot is first connected, and whenever
     * 
     */
    @Override
    public void robotInit() {
        constantOrganize();
        commandConfig();
        log();
    }

    @Override
    public void autonomousInit() {
        initState();

        if (getAutoCommand() != null) getAutoCommand().schedule();
    }

    @Override
    public void teleopInit() {
        teleopConfig();
    }

    @Override
    public void robotPeriodic() {
        DashboardStreams.update();
    }

    protected abstract void constantOrganize();
    protected abstract void commandConfig();
    protected abstract void log();
    protected abstract void bindButtons();

    protected abstract void initState();

    protected abstract void autoConfig();
    protected abstract void teleopConfig();



    protected Command getAutoCommand() { return null; }
}