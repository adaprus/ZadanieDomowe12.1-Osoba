public class IncorrectAgeException extends Exception {
    public IncorrectAgeException(String message) {
        super("Wiek nie może być mniejszy niż 1");
    }
}
