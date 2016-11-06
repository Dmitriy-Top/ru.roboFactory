package Entity;

/**
 * Created by дима on 06.11.2016.
 */
public class RoboLegs extends RoboParts {

    public RoboLegs (String manufacturer){
        super(manufacturer);
    }
    @Override
    public String getManufactorer() {
        return super.manufactorer+" - legs division";
    }
}
