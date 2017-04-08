import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        String password;
        boolean norm=true;
        Scanner scanner = new Scanner(System.in);
        Verificator ver = new Verificator();
        while (norm) {
            System.out.println("Введите пароль: ");
            password = scanner.nextLine();
            try {
                ver.verify(password);
            } catch (PasswordException e) {

            }

        }
    }
}
