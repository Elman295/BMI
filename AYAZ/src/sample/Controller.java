package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;

public class Controller {

    @FXML
    private TextField weighttxt;

    @FXML
    private TextField heighttxt;

    @FXML
    private Text resulttxt;

    @FXML
    private Button confirmbtn;

    @FXML
    void activeconfirm(ActionEvent event) {

        String weightstring=weighttxt.getText();
        String heightstring=heighttxt.getText();
        double weightdouble=Double.parseDouble(weightstring);
        double heightdouble=Double.parseDouble(heightstring);
        double BMI=weightdouble/(Math.pow(heightdouble,2));
        String BMIstring=String.valueOf(BMI);
        resulttxt.setText(BMIstring);

    }

}