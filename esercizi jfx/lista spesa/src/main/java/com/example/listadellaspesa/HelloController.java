package com.example.listadellaspesa;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button addListButton;

    @FXML
    protected void onaddListButton() {
        welcomeText.setText("Le tue Liste");
        RegistroListe.getInstance().addLista("pippo");

    }

}