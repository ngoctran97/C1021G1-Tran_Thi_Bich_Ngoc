package ss19_String.Exercise.PhoneNumber;

public class PhoneNumberExampleText {
    private static PhoneNumberExample phoneNumberExample;
    public static final String[] valiPhoneNumber = new String[]{"(84)-(092345678)"};
    public static final String[] invaPhoneNumber = new String[]{"(12)-(34748031)"};

    public static void main(String[] args) {
        phoneNumberExample = new PhoneNumberExample();
        for (String phonenumber : valiPhoneNumber){
            boolean isphonenumber = phoneNumberExample.phonenumber(phonenumber);
            System.out.println("phone number is " + phonenumber +"is valid : " + isphonenumber);

        }
        for (String phonenumber : invaPhoneNumber){
            boolean isphonenumber = phoneNumberExample.phonenumber(phonenumber);
            System.out.println("phone number is " + phonenumber +"is valid : " + isphonenumber);
        }
    }

}
