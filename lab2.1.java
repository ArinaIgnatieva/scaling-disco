
import java.util.Scanner;
import java.util.regex.*;


public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        boolean password_input = true;

        System.out.print("Введите пароль:");
        
        do {
            String password = Scan.nextLine();
            Matcher m_lower = Pattern.compile("[a-z]+").matcher(password);
            Matcher m_upper = Pattern.compile("[A-Z]+").matcher(password);
            Matcher m_dig = Pattern.compile("[0-9]+").matcher(password);
            Matcher m_common = Pattern.compile("\\w{8,}").matcher(password);
            if (m_upper.find() && m_lower.find() && m_dig.find() && m_common.find()){
                System.out.print("Пароль надежен");
                password_input = false;
            }
            else
                System.out.print("Пароль не надежен, введите заново:");

        } while (password_input);

    }
}
