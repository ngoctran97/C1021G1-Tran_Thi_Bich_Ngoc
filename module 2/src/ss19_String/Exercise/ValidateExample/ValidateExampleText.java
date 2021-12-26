package ss19_String.Exercise.ValidateExample;

public class ValidateExampleText {
    private static ValidateExample validateExample;
    public static final String[] valiValidata = new String[]{"C1234G","A7890H","P3456M"};
    public static final String[] invalidValidata = new String[]{"B1234C","M1957O","$124E"};

    public static void main(String[] args) {
        validateExample = new ValidateExample();
        for (String validata : valiValidata){
            boolean isvalid = validateExample.validate(validata);
            System.out.println("Validata is " + validata +" is valid: " + isvalid);
        }
        for (String validata : invalidValidata){
            boolean isvalid = validateExample.validate(validata);
            System.out.println("Validata is " + validata + " is valid : " + isvalid);
        }
    }
}
