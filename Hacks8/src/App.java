import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker.State;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class App extends Application {
    
  
    
    
    private Scene scene; 
   
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Quest Log");
       
         WebView browser = new WebView();
         WebEngine webEngine = browser.getEngine();
         
        webEngine.load("http://www.oracle.com/products/index.html");
    
        StackPane root = new StackPane();
        root.getChildren().add(browser);

        scene = new Scene(root, 750, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

       public static void main(String[] args) {
              launch(args);
          }
    }
    
        

    
  /*
  Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
  Scene scene = new Scene(root);
  */

  */
