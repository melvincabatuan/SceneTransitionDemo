package com.example.scenetransitiondemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML
    private Label welcomeText;


    @FXML
    private TextField nameField;


    @FXML
    protected void onHelloButtonClick(ActionEvent event) throws IOException {
        String name = nameField.getText();
        welcomeText.setText("Welcome " + name);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("second-view.fxml"));
        Parent root = loader.load();

        SecondController controller2 = loader.getController();
        controller2.showText("Hello " + name + "!");

//        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow(); // same window
        Stage window = new Stage();
        window.setScene(new Scene(root));
        window.setTitle("Scene 2");
        window.show();
    }
}