import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


public class App extends Application {

    Scene scene;
    BorderPane root;
    HBox buttonMenu;
    TabPane tabs;
    Profile profile;
    Log log;
    Map map;
    Quest primaryQuest;
    Button logButton;
    Button mapButton;
    Button profileButton;

    @Override
    public void start(Stage primaryStage) throws IOException {
        
        setButtonHandlers();
        
        
        tabs = new TabPane();
        tabs.setTabMinHeight(-10);
        tabs.setTabMaxHeight(-10);
        tabs.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
        tabs.getStyleClass().add("wizard");
        //root.getTabs().add(btn);
        profile = new Profile();
        log = new Log();
        map = new Map();
        
        primaryQuest = new Quest("Historical Hunt", new Attribute(), new Task("Visit the Snelling dinner bell!", "attributes"), new Task("Eat at OHouse!", "attribute"));
        log.addQuest(primaryQuest);

        //System.out.println(profile.getLog().toString());

        tabs.getTabs().addAll(profile, log, map);
        buttonMenu = new HBox();
        buttonMenu.getChildren().addAll(mapButton, logButton, profileButton);
        //buttonMenu.getChildren().addAll(logButton, mapButton, communityButton);
        buttonMenu.setAlignment(Pos.CENTER);
        root = new BorderPane(tabs, null, null, buttonMenu, null);
        //root.getChildren().addAll(tabs);
        
        /*
        Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
        Scene scene = new Scene(root);
        */
        
        scene = new Scene(root, 450, 800);
  
        primaryStage.setTitle("QuestLine");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        /*
        stage.setTitle("HTML");
        stage.setWidth(500);
        stage.setHeight(500);
        Scene scene = new Scene(new Group());

        VBox root = new VBox();     

        final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();

        InputStream stream = new FileInputStream("lib/test.html");
        //File htmlFile = new File(stream);
        String content = new String(Files.readAllBytes(Paths.get("lib/test.html")));
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(browser);
        webEngine.loadContent(content);

        root.getChildren().addAll(scrollPane);
        scene.setRoot(root);

        stage.setScene(scene);
        stage.show();
        */
    } //start
 
    public void init() {

    } //init

    public static void main(String[] args) {
        launch(args);
    } //main



    public void setButtonHandlers() {
        logButton = new Button();
        logButton.setText("log");
        logButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tabs.getSelectionModel().select(log);
            }
        });
        Image logImage = new Image("file:Resources\\Codey profile.png");
        ImageView logImageView = new ImageView(logImage);
        logImageView.setFitHeight(125);
        logImageView.setFitWidth(125);
        logButton.

        mapButton = new Button();
        mapButton.setText("map");
        mapButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tabs.getSelectionModel().select(map);
            }
        });

        profileButton = new Button();
        profileButton.setText("profile");
        profileButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tabs.getSelectionModel().select(profile);
            }
        });
    } //setButtonHandlers

} //App