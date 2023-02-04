import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
 
public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        String filePath = new File("").getAbsolutePath();
        filePath.concat("lib/home_screen_map.PNG");
        InputStream stream = new FileInputStream("C:\\Users\\Codey\\git\\UGAHacks-8\\Hacks8\\lib\\home_screen_map.PNG");
        Image image = new Image(stream);
        ImageView imageView = new ImageView(image);
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        //StackPane root = new StackPane();
        VBox root = new VBox();
        root.getChildren().add(btn);
        root.getChildren().add(imageView);
  
  /*
  Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
  Scene scene = new Scene(root);
  */
  
  Scene scene = new Scene(root, 400, 800);
  
  primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
 public static void main(String[] args) {
        launch(args);
    }
}