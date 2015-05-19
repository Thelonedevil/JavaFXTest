package uk.tldcode;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by justin on 02/09/2014.
 */
public class Main extends Application{
    public static Stage stage;

    public static void main(String[] args){
        launch(args);
    }

    /**
     * The main entry point for all JavaFX applications.
     * The start method is called after the init method has returned,
     * and after the system is ready for the application to begin running.
     * <p/>
     * <p>
     * NOTE: This method is called on the JavaFX Application Thread.
     * </p>
     *
     * @param primaryStage the primary stage for this application, onto which
     *                     the application scene can be set. The primary stage will be embedded in
     *                     the browser if the application was launched as an applet.
     *                     Applications may create other stages, if needed, but they will not be
     *                     primary stages and will not be embedded in the browser.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent connect = FXMLLoader.load(getClass().getClassLoader().getResource("start.fxml"));
        primaryStage.setTitle("TLD IRC Client");
        double height = primaryStage.getHeight();
        double width = primaryStage.getWidth();
        Parent start;
        if(width <=640 &&width > 1920 && height <= 480 && height > 1080){
            start = FXMLLoader.load(getClass().getClassLoader().getResource("Client-640x480.fxml"));
            primaryStage.setScene(new Scene(start,640,480));
        }else {
            start = FXMLLoader.load(getClass().getClassLoader().getResource("Client-1920x1080.fxml"));
            primaryStage.setScene(new Scene(start,1920,1080));
        }

        //primaryStage.setScene(new Scene(start,640,480));
        primaryStage.show();

        stage = new Stage();
        stage.setScene(new Scene(connect, 300, 275));
        stage.show();
    }
}
