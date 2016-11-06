package Entity;

/**
 * Created by дима on 06.11.2016.
 */
public abstract class RoboParts {
    protected String manufactorer;
    abstract public String getManufactorer();
    RoboParts (String manufacturer){
        this.manufactorer = manufacturer;
    }
}
