package com.example.jfxprogect;

import com.example.jfxprogect.model.Registro;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button addPersonaButton;

    @FXML
    private Label personeLabel;

    @FXML
    private TextField textField;

    @FXML
    protected void onaddPersonaButtonClick() {
        if(textField.getText()!="") {
            Registro.getInstance().addPersona(textField.getText());
            textField.setText("");
            personeLabel.setText(Registro.getInstance().getNomi());
        }

    }
}