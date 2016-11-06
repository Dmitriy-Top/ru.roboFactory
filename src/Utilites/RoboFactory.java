package Utilites;

import Entity.*;

/**
 * Created by дима on 06.11.2016.
 */
public class RoboFactory {
    public static Robot getNewRobot(){
        RoboParts roboHands = getRobotPart("hands");
        RoboParts roboLegs = getRobotPart("legs");
        RoboParts roboBody = getRobotPart("body");
        RoboParts roboHead = getRobotPart("head");
        Robot robot = new Robot(roboHands,roboLegs,roboBody,roboHead);
        return robot;
    }
    private static String getManufacturerName(){
        String[] manufacturerList = {"RobInc","PMD","HailRobotPro","HumanSunsetCorp"};
        return manufacturerList[(int)(Math.random()*manufacturerList.length)];
    }
    private static RoboParts getRobotPart(String partName){
        String manufacturer = RoboFactory.getManufacturerName();
        if ("hands".equals(partName)) return new RoboHands(manufacturer);
        if ("legs".equals(partName)) return new RoboLegs(manufacturer);
        if ("body".equals(partName)) return new RoboBody(manufacturer);
        if ("head".equals(partName)) return new RoboHead(manufacturer);
        return null;
    }

}
