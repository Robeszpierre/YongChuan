package Controller;

import javafx.scene.control.Alert;
import javafx.util.StringConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class SecureLocalDateStringConverter extends StringConverter<LocalDate> {
    /**
     * The date pattern that is used for conversion.
     */
    private static final String DATE_PATTERN = "yyyy. MM. dd.";

    /**
     * The date formatter.
     */
    public final DateTimeFormatter DATE_FORMATTER =
            DateTimeFormatter.ofPattern(DATE_PATTERN);

    private boolean hasParseError = false;

    public boolean hasParseError(){
        if(hasParseError) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba üzenet");
            alert.setHeaderText("Helytelen formátumban töltötte ki a dátumot!");
            alert.setContentText("Kérem az alábbi formátumban töltse ki: éééé. hh. nn. \n Például.: 1974. 05. 21.");

            alert.showAndWait();
        };
        return hasParseError;
    }

    @Override
    public String toString(LocalDate localDate) {
        return DATE_FORMATTER.format(localDate);
    }

    @Override
    public LocalDate fromString(String formattedString) {

        try {
            LocalDate date=LocalDate.from(DATE_FORMATTER.parse(formattedString));
            hasParseError=false;
            return date;
        } catch (DateTimeParseException parseExc){
            hasParseError=true;
            return null;
        }
    }

}