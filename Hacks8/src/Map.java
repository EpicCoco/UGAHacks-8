import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;

public class Map extends Tab {
    
    VBox content;
    Insets insets25 = new Insets(10, 20, 10, 20);
    Image map;

    public Map() {
        this.setText("Map");
        initMap();
    } //Map

    public void initMap() {
        content = new VBox();
        content.setPadding(insets25);
        map = new Image("file:Resources\\Screenshot_2023-02-05_010312.png");
        ImageView mapView = new ImageView(map);
        BorderPane pane = new BorderPane();
        pane.setPrefSize(400, 300);
        pane.setCenter(mapView);
        mapView.setFitHeight(650);
        mapView.setFitWidth(410);
        content.getChildren().add(mapView);
        this.setContent(content);
    }//initMap
} //Map
