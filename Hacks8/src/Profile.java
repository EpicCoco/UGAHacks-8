import javafx.scene.layout.VBox;
public class Profile extends VBox {
    
    Log log;

    public Profile() {
        super();
        log = new Log();
        this.getChildren().add(log);
    } //Profile

    public Log getLog() {
        return log;
    } //getLog

} //Profile
