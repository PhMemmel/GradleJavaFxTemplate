package edv.memmel.javafxeinfuehrung.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * FX controller class for main window.
 */
public class MainWindowFxController {

  @FXML
  Label werbungsLabel;

  @FXML
  void buttonClicked() {
    werbungsLabel.setText("Hallihallo");
  }

}
