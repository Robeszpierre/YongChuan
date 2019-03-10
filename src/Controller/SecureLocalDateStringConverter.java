package Controller;

import javafx.util.StringConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class SecureLocalDateStringConverter extends StringConverter<LocalDate> {
    /**
     * The date pattern that is used for conversion.
     */
    private static final String DATE_PATTERN = "yyyy. MM. dd.";
    private static final String DATE_PATTERN2 = "yyyy.MM.dd.";

    /**
     * The date formatter.
     */
    public final DateTimeFormatter DATE_FORMATTER =
            DateTimeFormatter.ofPattern(DATE_PATTERN);
    public final DateTimeFormatter DATE_FORMATTER2 =
            DateTimeFormatter.ofPattern(DATE_PATTERN2);

    private boolean hasParseError = false;
    private boolean hasParseError2 = false;

    public boolean hasParseError(){
        return hasParseError;
    }
    public boolean hasParseError2(){
        return hasParseError2;
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
    public LocalDate fromString2(String formattedString) {
        try {
            LocalDate date=LocalDate.from(DATE_FORMATTER2.parse(formattedString));
            hasParseError2=false;
            return date;
        } catch (DateTimeParseException parseExc){
            hasParseError2=true;
            return null;
        }
    }

}