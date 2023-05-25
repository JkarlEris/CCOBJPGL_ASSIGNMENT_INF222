package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.text.Text;
import model.*;

public class DrinkController {

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;
    Text text1;

  
    Lemon lemon = new Lemon();
    MoguMogu mogumogu = new MoguMogu();
    Soju soju = new Soju();
    Tequila tequila = new Tequila();
    Coffee coffee = new Coffee();

    public void initialize() {

        lemon.setColor("Yellow");
        lemon.setTaste("Ayawq neto");

        mogumogu.setColor("Pink");
        mogumogu.setTaste("Sarap ng chaser");

        soju.setColor("Green");
        soju.setTaste("Pang inom");

        tequila.setColor("brown");
        tequila.setTaste("GUSTO KO TEQUILA");

        coffee.setColor("brown");
        coffee.setTaste("Pait par");


    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Lemons are " + lemon.getColor() + " and " + lemon.getTaste());
            
        }

        if (sourceButton == btn2) {
            alert.setContentText("MoguMogus are " + mogumogu.getColor() + " and " + mogumogu.getTaste());
            
        }

        if (sourceButton.equals(btn3)) {
            alert.setContentText("Sojus are " + soju.getColor() + " and " + soju.getTaste());
            
        }

        if (sourceButton.equals(btn4)) {
            alert.setContentText("Tequilas are " + tequila.getColor() + " and " + tequila.getTaste());
            
        }

        if (sourceButton.equals(btn5)) {
            alert.setContentText("Coffees are " + coffee.getColor() + " and " + coffee.getTaste());
          
        }


        alert.showAndWait();

    }
}