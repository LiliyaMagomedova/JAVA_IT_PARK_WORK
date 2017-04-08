public class Verificator {
    public void verify (String password) {
        if (password.length()<6) {
            throw new PasswordException();
        }
    }

}
