package Entity;

/**
 * Created by дима on 06.11.2016.
 */
public class RoboBody extends RoboParts {

    public RoboBody (String manufacturer){
        super(manufacturer);
    }
    @Override
    public String getManufactorer() {
        return super.manufactorer+" - bodys division";
    }
}
