import java.util.HashMap;
import java.util.Map;

public class TelephoneDirectory {
    private HashMap<Long, String> phones;

    public TelephoneDirectory() {
        phones = new HashMap<>();
    }

    public TelephoneDirectory(HashMap<Long, String> phones) {
        this.phones = phones;
    }

    public void getPhones(String surname) {
        if (!phones.containsValue(surname))
            System.out.println("Missing in the directory.");
        else {
            System.out.println("Surname: " + surname + "\nPhones:");
            for (Map.Entry m : phones.entrySet()){
                if (m.getValue() == surname)
                    System.out.println(m.getKey());
            }
        }
    }

    public void add(Long phone, String surname) {
        if (phones.containsKey(phone))
            System.out.println("The phone number \'" + phone + "\' presents in the directory.");
        else
            phones.put(phone,surname);
    }

    public void addPerson(Person person) {
        add(person.getPhoneNumber(), person.getSurname());
    }

    public void setPhones(HashMap<Long, String> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "TelephoneDirectory {" +
                "phones=" + phones +
                '}';
    }
}
