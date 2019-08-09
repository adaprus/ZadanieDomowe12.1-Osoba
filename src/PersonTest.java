import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            Person person = new Person();
            System.out.println("Wprowadź dane osoby. \nPodaj imię:");
            person.setFirstName(scanner.nextLine());
            System.out.println("Podaj nazwisko: ");
            person.setLastName(scanner.nextLine());
            System.out.println("Podaj wiek: ");
            person.setAge(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Podaj PESEL");
            person.setPESEL(scanner.nextLine());
        } catch (NameUndefinedException | IncorrectAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

