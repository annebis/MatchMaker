package matchmaker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class FXMLDocumentController implements Initializable {

    @FXML
    Label lbHeader;
    @FXML
    TextField txtyourname, txtzengname;
    @FXML
    TextArea textarea;

    String f_name;
    String z_name;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lbHeader.setText("Match Maker");
    }

    public void calc(ActionEvent actionEvent) {
        f_name = txtyourname.getText();
        z_name = txtzengname.getText();
        if (f_name.equals("") || z_name.equals("")) {
            System.out.println("No empty fields");
        } else
            randomNumber();
        txtyourname.setText("");
        txtzengname.setText("");
    }

    private void randomNumber(){
        f_name = txtyourname.getText();
        z_name = txtzengname.getText();
        Random rd = new Random();
        int randnum = rd.nextInt(10)+1;
        if (randnum <= 10 && randnum >= 9) {
            textarea.setText(randnum+"\nPossibility of a Zeng between\n"+f_name+" and "+z_name+" is 100%");
        } else if (randnum < 9 && randnum >= 7){
            textarea.setText(randnum+"\nPossibility of a Zeng between\n"+f_name+" and "+z_name+" is 80%");
        } else if (randnum < 7 && randnum >= 5){
            textarea.setText(randnum+"\nPossibility of a Zeng between\n"+f_name+" and "+z_name+" is 60%");
        } else if (randnum < 5 && randnum >= 3){
            textarea.setText(randnum+"\nPossibility of a Zeng between\n"+f_name+" and "+z_name+" is 40%");
        } else if (randnum < 3 && randnum >= 2){
            textarea.setText(randnum+"\nPossibility of a Zeng between\n"+f_name+" and "+z_name+" is 20%");
        } else {
            textarea.setText(randnum+"\nPossibility of a Zeng between\n"+f_name+" and "+z_name+" is Not possible");
        }
    }

    /*private void zengNames() {
        char[] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'};
        f_name = txtYourName.getText();
    }*/

    public void clear(ActionEvent actionEvent) {
        txtyourname.setText("");
        txtzengname.setText("");
        textarea.setText("");
    }
}


 
        