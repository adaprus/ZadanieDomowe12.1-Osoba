import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Wprowadź dane osoby. \nPodaj imię:");
            String firstName = scanner.nextLine();
            System.out.println("Podaj nazwisko: ");
            String lastName = scanner.nextLine();
            System.out.println("Podaj wiek: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Podaj PESEL");
            String PESEL = scanner.nextLine();
            Person person1 = new Person(firstName, lastName, age, PESEL);
            System.out.println(person1);
        } catch (NameUndefinedException | IncorrectAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

