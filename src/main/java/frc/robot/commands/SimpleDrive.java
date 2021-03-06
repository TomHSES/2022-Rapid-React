package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class SimpleDrive extends CommandBase 
{
  private final Drivetrain Drivetrain;

  private final Joystick Joystick;

  public SimpleDrive(Drivetrain drivetrain, Joystick joystick) 
  {
    Drivetrain = drivetrain;
    Joystick = joystick;
    addRequirements(drivetrain);
  }

  @Override
  public void execute() 
  {
    Drivetrain.ArcadeDrive(Joystick.getRawAxis(0), -Joystick.getRawAxis(1));
  }

  @Override
  public boolean isFinished() 
  {
    return false;
  }
}