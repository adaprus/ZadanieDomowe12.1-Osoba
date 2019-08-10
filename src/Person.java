public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String PESEL;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, String PESEL) throws NameUndefinedException, IncorrectAgeException {
        checkFirstName(firstName);
        checkAge(age);
        checkLastName(lastName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.PESEL = PESEL;
    }

    private void checkAge(int age) throws IncorrectAgeException {
        if (age <= 0) {
            throw new IncorrectAgeException("Wiek nie może być mniejszy niż 1");
        }
    }

    private void checkFirstName(String firstName) throws NameUndefinedException {
        if (firstName == null || firstName.length() < 3) {
            throw new NameUndefinedException();
        }
    }

    private void checkLastName(String lastName) throws NameUndefinedException {
        if (lastName == null || lastName.length() < 3) {
            throw new NameUndefinedException();
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws NameUndefinedException {
        checkFirstName(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameUndefinedException {
        checkLastName(lastName);
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {
        checkAge(age);
        this.age = age;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", PESEL='" + PESEL + '\'' +
                '}';
    }
}
