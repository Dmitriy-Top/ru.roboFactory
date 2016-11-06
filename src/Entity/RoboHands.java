package Entity;

/**
 * Created by дима on 06.11.2016.
 */
public class RoboHands extends RoboParts {

    public RoboHands (String manufacturer){
        super(manufacturer);
    }
    @Override
    public String getManufactorer() {
        return super.manufactorer+" - hands division";
    }
}
