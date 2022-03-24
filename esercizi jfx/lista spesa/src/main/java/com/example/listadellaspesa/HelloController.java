package com.example.listadellaspesa;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button addListButton;

    @FXML
    private Label listOfList;

    @FXML
    private TextField inputList;

    @FXML
    private Button cercaButton;
    @FXML
    private Button addArticle;


    @FXML
    protected void onaddListButton() {

        cercaButton.setDisable(false);
        welcomeText.setText("Le tue Liste");

        if(inputList.getText()!="") {
            RegistroListe.getInstance().addLista(inputList.getText());
            listOfList.setText(RegistroListe.getInstance().getListe());
            inputList.setText("");
        }
    }
    @FXML
    protected void onaddArticle() {
        addListButton.setDisable(true);
    }
    @FXML
    protected void oncercaButton() {

        String temp="";
        listOfList.setText(temp);
        addArticle.setDisable(false);

        if(inputList.getText()!="" && RegistroListe.getInstance().exist(inputList.getText())) {
            welcomeText.setText(RegistroListe.getInstance().findListaByNome(inputList.getText()).nome);
            for (String ele : RegistroListe.getInstance().findListaByNome(inputList.getText()).articoli){
                temp+=ele+"\n";
            }

            listOfList.setText(temp);

            inputList.setText("");
        }
        else{
            welcomeText.setText("LISTA NON TROVATA");
        }


    }

}