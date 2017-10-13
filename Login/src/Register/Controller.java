package Register;

import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    Label msg;

    @FXML
    TextField username;

    @FXML
    TextField email;

    @FXML
    TextField password;

    @FXML
    TextField repassword;

    private String Username, Email, Password, Repassword;

    @FXML
    private void RegisterClick(ActionEvent event) throws SQLException {

        boolean Regstatus = false;

        Username = username.getText();
        Email = email.getText();
        Password = password.getText();
        Repassword = repassword.getText();

        if (Username.isEmpty() || Email.isEmpty() || Password.isEmpty() || Repassword.isEmpty()) {
            msg.setText("Fileds missing");
        } else {

            if (Password.equals(Repassword)) {
                if (validate(Email)) {

                    Model md = new Model();

                    if (md.checkUserExistence(Username)) {
                        msg.setText("User alerday existing in the database.");
                    } else {

                        Regstatus = md.addUser(Username, Email, Password);

                        if (Regstatus) {
                            msg.setText("Registered Succesfully.");

                            username.setText("");

                            password.setText("");

                            repassword.setText("");

                            email.setText("");

                        } else {
                            msg.setText("Registered Failed.");
                        }

                    }
                } else {
                    msg.setText("Invalid email format.");
                }
            } else {
                msg.setText("Password doen't matches");
            }

        }

    }

    public static boolean validate(String emailStr) {
        Pattern VALID_EMAIL_ADDRESS_REGEX
                = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

}
