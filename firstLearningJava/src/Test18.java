import java.util.regex.Pattern;

public class Test18 {

    public static void main(String[] args){

        String firstName = "Oh";
        String lastName = "Jung-Im";
        String tel = "010-1234-5678";
        String email = "purum@ruby.com";

        boolean firstName_check = Pattern.matches("[A-Z][a-zA-Z]*", firstName);
        boolean lastName_check = Pattern.matches("[a-zA-Z]+(['-][a-zA-Z]+)*", lastName);

        System.out.println("first Name : " + firstName_check);
        System.out.println("last Name : " + lastName_check);
    }
}
