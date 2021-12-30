import java.util.Objects;

public class Person implements Comparable{
    private String surname;
    private Long phoneNumber;

    public Person(String surname, Long phoneNumber) {
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return surname.equals(person.surname) && phoneNumber.equals(person.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, phoneNumber);
    }

    @Override
    public int compareTo(Object o) {
        Person another = (Person) o;
        if (this.phoneNumber > another.phoneNumber) {
            return 1;
        }
        if (this.phoneNumber < another.phoneNumber) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Person {" +
                "surname='" + surname + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
