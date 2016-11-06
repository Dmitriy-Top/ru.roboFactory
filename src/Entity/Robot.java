package Entity;

/**
 * Created by дима on 06.11.2016.
 */
public class Robot {
    private RoboParts[] roboParts = new RoboParts[4];

    public Robot(RoboParts roboHands, RoboParts roboLegs, RoboParts roboBody, RoboParts roboHead) {
        this.roboParts[0] = roboHands;
        this.roboParts[1] = roboLegs;
        this.roboParts[2] = roboBody;
        this.roboParts[3] = roboHead;
    }

    public void testThisRobot(){
        System.out.println("Тест робота начат:");
        for (RoboParts roboPart : roboParts){
            System.out.println("Тип узла: "+roboPart.getClass() + ", компания производитель: " +roboPart.getManufactorer());
        }
        System.out.println("Тест закончен");


    }
}
