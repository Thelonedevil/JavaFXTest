package uk.tldcode;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

/**
 * Created by justin on 02/09/2014.
 */
public class Controller {
    public TextField server;
    public TextField port;
    public TextField password;
    public TextField nick;

    public void connect(ActionEvent actionEvent) {
        //new Client(server.getText(),Integer.parseInt(port.getText()),password.getText(),nick.getText(),nick.getText(),nick.getText());
        Main.stage.close();

    }


}
