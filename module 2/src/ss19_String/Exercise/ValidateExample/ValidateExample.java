package ss19_String.Exercise.ValidateExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String VALIDATE_REGSE = "^[CAP][0-9]{4}[GHKLM]$";
    public ValidateExample(){
        pattern = Pattern.compile(VALIDATE_REGSE);

    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
