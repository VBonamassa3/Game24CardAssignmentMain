package org.example.game24cardassignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.util.Random;

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

    String[] suits = {"hearts", "diamonds", "clubs", "spades"};
    Random random = new Random();

    @FXML
    void onRefreshClick(ActionEvent event) {
        int card1 = random.nextInt(13)+1;
        int card2 = random.nextInt(13)+1;
        int card3 = random.nextInt(13)+1;
        int card4 = random.nextInt(13)+1;

        String suit1 = suits[random.nextInt(4)];
        String suit2 = suits[random.nextInt(4)];
        String suit3 = suits[random.nextInt(4)];
        String suit4 = suits[random.nextInt(4)];

        Card1.setImage(new Image(new File("src/main/resources/org/example/game24cardassignment/png/" + card1 + "_of_" + suit1 + ".png").toURI().toString()));
        Card2.setImage(new Image(new File("src/main/resources/org/example/game24cardassignment/png/" + card2 + "_of_" + suit2 + ".png").toURI().toString()));
        Card3.setImage(new Image(new File("src/main/resources/org/example/game24cardassignment/png/" + card3 + "_of_" + suit3 + ".png").toURI().toString()));
        Card4.setImage(new Image(new File("src/main/resources/org/example/game24cardassignment/png/" + card4 + "_of_" + suit4 + ".png").toURI().toString()));
    }

    @FXML
    void onVerifyClick(ActionEvent event) {
        verifyText.setText("This expression does not work");
    }
} //script engine javascript, get ai key, do hint no solution