package org.example.game24cardassignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class CardController {

    @FXML
    private ImageView Card1;

    @FXML
    private ImageView Card2;

    @FXML
    private ImageView Card3;

    @FXML
    private ImageView Card4;

    @FXML
    private TextField enterExpression;

    @FXML
    private Button refreshCards;

    @FXML
    private Button verify24;

    @FXML
    private Label verifyText;

    @FXML
    void onVerifyClick(ActionEvent event) {
        verifyText.setText("This expression does not work");
    }
} //script engine javascript, get ai key, do hint no solution