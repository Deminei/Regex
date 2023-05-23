import java.util.regex.Pattern;

public class Regex {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("\\b[\\w\\.-]+@[\\w\\.-]+\\.\\w{2,4}\\b");
    private static final Pattern PHONE_NUMBER_PATTERN = Pattern.compile("(?:\\d{1}\\s)?\\(?(\\d{3})\\)?-?\\s?(\\d{3})-?\\s?(\\d{4})");
    private static final Pattern DATE_PATTERN = Pattern.compile("^(0?[1-9]|1[0-2])[\\/](0?[1-9]|[12]\\d|3[01])[\\/](19|20)\\d{2}$");
    private static final Pattern URL_PATTERN = Pattern.compile("[-a-zA-Z0-9@:%_\\+.~#?&//=]{2,256}\\.[a-z]{2,4}\\b(\\/[-a-zA-Z0-9@:%_\\+.~#?&//=]*)?");
    private static final Pattern CREDIT_CARD_PATTERN = Pattern.compile("(\\d{4}[-. ]?){4}|\\d{4}[-. ]?\\d{6}[-. ]?\\d{5}");
    private static final Pattern ZIP_CODE_PATTERN = Pattern.compile("[0-9]{5}(-[0-9]{4})?");
    private static final Pattern JAVA_IDENTIFIER_PATTERN = Pattern.compile("^[a-zA-Z_$][a-zA-Z0-9_$]*$");
    private static final Pattern HEX_COLOR_PATTERN = Pattern.compile("^#?([0-9a-f]{3}){1,2}$");
    private static final Pattern TIME_PATTERN = Pattern.compile("([01]?[0-9]|2[0-3]):[0-5][0-9](:[0-5][0-9])?");

    public static void main(String[] args) {
        System.out.println("Valid email: " + isValidEmail("thecoolestdude@yahoo.com"));
        System.out.println("Valid phone number: " + isValidPhoneNumber("(800) 555-5565"));
        System.out.println("Valid date: " + isValidDate("05/23/2023"));
        System.out.println("Valid URL: " + isValidUrl("www.neopets.com"));
        System.out.println("Valid credit card: " + isValidCreditCard("4485-5302-7399-3123"));
        System.out.println("Valid zipcode: " + isValidZipCode("48975-5689"));
        System.out.println("Valid java: " + isValidJava("$validJavaThing$"));
        System.out.println("Valid hex color: " + isValidHex("#ff5599"));
        System.out.println("Valid time: " + isValidTime("10:30"));
    }
    public static boolean isValidEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }
    public static boolean isValidPhoneNumber(String number) {
        return PHONE_NUMBER_PATTERN.matcher(number).matches();
    }
    public static boolean isValidDate(String date) {
        return DATE_PATTERN.matcher(date).matches();
    }
    public static boolean isValidUrl(String url) {
        return URL_PATTERN.matcher(url).matches();
    }
    public static boolean isValidCreditCard(String card) {
        return CREDIT_CARD_PATTERN.matcher(card).matches();
    }
    public static boolean isValidZipCode(String zipcode) {
        return ZIP_CODE_PATTERN.matcher(zipcode).matches();
    }
    public static boolean isValidJava(String java) {
        return JAVA_IDENTIFIER_PATTERN.matcher(java).matches();
    }
    public static boolean isValidHex(String hex){
        return HEX_COLOR_PATTERN.matcher(hex).matches();
    }
    public static boolean isValidTime(String time){
        return TIME_PATTERN.matcher(time).matches();
    }
    //Cleaner than my original *chef's kiss*
}
