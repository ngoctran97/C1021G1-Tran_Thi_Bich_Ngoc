package ss19_String.Exercise.PhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    public static Pattern pattern;
    private Matcher matcher;

    private static final String PHONENUMBER_REGEX = "^\\(84\\)\\-\\(09[0-9]{7}\\)";
    public PhoneNumberExample(){
        pattern = Pattern.compile(PHONENUMBER_REGEX);
    }
    public boolean phonenumber(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
