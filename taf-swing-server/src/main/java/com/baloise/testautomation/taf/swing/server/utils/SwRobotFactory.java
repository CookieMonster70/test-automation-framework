/*
 ===========================================================================
 @    $Author$
 @  $Revision$
 @      $Date$
 @
 ===========================================================================
 */
package com.baloise.testautomation.taf.swing.server.utils;

import org.assertj.swing.core.BasicRobot;
import org.assertj.swing.core.Robot;

/**
 * 
 */
public class SwRobotFactory {

  private static Robot robot = null;
  
  public static int delayBetweenEvents = 10;
  public static int eventPostingDelay = 10;
  public static int delayBetweenKeystrokes = 100;

  public static Robot getRobot() {
    if (robot == null) {
      robot = BasicRobot.robotWithCurrentAwtHierarchyWithoutScreenLock();
      robot.settings().delayBetweenEvents(delayBetweenEvents);
      robot.settings().eventPostingDelay(eventPostingDelay);
    }
    return robot;
  }
}
