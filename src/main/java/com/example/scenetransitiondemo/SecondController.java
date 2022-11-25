package com.example.scenetransitiondemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SecondController {

    @FXML
    private Label scene2Label;

    void showText(String text){
        scene2Label.setText(text);
    }
}