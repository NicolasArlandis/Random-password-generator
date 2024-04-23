import Pass.PasswordGenerator;

public class Main {

    public static void main(String[] args) {
        int length = 10; // Comprimento da senha gerada.

        String password = PasswordGenerator.generatePassword(length);
        System.out.println("Sua senha gerada: " + password);
    }
}
