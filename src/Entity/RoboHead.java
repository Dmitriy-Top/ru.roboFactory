package Entity;

/**
 * Created by дима on 06.11.2016.
 */
public class RoboHead extends RoboParts {

    public RoboHead (String manufacturer){
        super(manufacturer);
    }
    @Override
    public String getManufactorer() {
        return super.manufactorer+" - heads division";
    }
}
