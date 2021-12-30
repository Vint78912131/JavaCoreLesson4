import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class JavaCoreLesson4 {
    public static void main(String[] args) {

        SimpleArrayList arr1 = new SimpleArrayList();
        SimpleHashSet arr2 = new SimpleHashSet();
        SimpleTreeMap arr3 = new SimpleTreeMap();

        //Take the words from the file README for example.
        try {
            File file = new File("src/README");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                StringTokenizer st = new StringTokenizer(line, "1234567890[ .,:;()?!]+-'\"");
                while(st.hasMoreTokens())
                {
                    String newSt = st.nextToken().toLowerCase(Locale.ROOT);
                    arr1.addElement(newSt);
                    arr2.addElement(newSt);
                    arr3.addElement(newSt);
                }
            }
            br.close();
            fr.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(arr1 + "\n");
        System.out.println(arr2 + "\n");
        System.out.println("TreeMap sorted by key");
        System.out.println(arr3 + "\n");

        System.out.println("SimpleHashMap - how many times is a word \"создать\" repeated in the text: " + arr3.getElement("создать"));
        System.out.println("SimpleHashMap - how many times is a word \"массив\" repeated in the text: " + arr3.getElement("массив"));
        System.out.println("SimpleHashMap - how many times is a word \"бугага\" repeated in the text: " + arr3.getElement("бугага"));
        System.out.println("SimpleHashMap - how many times is a word \"слов\" repeated in the text: " + arr3.getElement("слов"));
        System.out.println("SimpleHashMap - how many times is a word \"с\" repeated in the text: " + arr3.getElement("с"));
        System.out.println("SimpleHashMap - how many times is a word \"консоль\" repeated in the text: " + arr3.getElement("консоль"));


        Person man1 = new Person("Иванов", 1234567890L);
        Person man2 = new Person("Иванов", 1234567891L);
        Person man3 = new Person("Иванов", 1234567891L);
        Person man4 = new Person("Петров", 1234567893L);
        Person man5 = new Person("Петров", 1234567894L);
        Person man6 = new Person("Сидоров", 1234567895L);
        Person man7 = new Person("Кузнецов", 1234567896L);
        Person man8 = new Person("Симонов", 1234567898L);
        Person man9 = new Person("Симонов", 1234567899L);
        Person man10 = new Person("Симонов", 1234567810L);
        Person man11 = new Person("Панкратов", 1234567810L);

        System.out.println("\nAdding persons in the telephone directory TD...");

        TelephoneDirectory TD = new TelephoneDirectory();
        System.out.println("TD.addPerson(man1)\n" + man1);
        TD.addPerson(man1);
        System.out.println("TD.addPerson(man2)\n" + man2);
        TD.addPerson(man2);
        System.out.println("TD.addPerson(man3)\n" + man3);
        TD.addPerson(man3);
        System.out.println("TD.addPerson(man4)\n" + man4);
        TD.addPerson(man4);
        System.out.println("TD.addPerson(man5)\n" + man5);
        TD.addPerson(man5);
        System.out.println("TD.addPerson(man6)\n" + man6);
        TD.addPerson(man6);
        System.out.println("TD.addPerson(man7)\n" + man7);
        TD.addPerson(man7);
        System.out.println("TD.addPerson(man8)\n" + man8);
        TD.addPerson(man8);
        System.out.println("TD.addPerson(man9)\n" + man9);
        TD.addPerson(man9);
        System.out.println("TD.addPerson(man10)\n" + man10);
        TD.addPerson(man10);
        System.out.println("TD.addPerson(man11)\n" + man11);
        TD.addPerson(man11);

        System.out.println("\nTelephoneDirectory\n");
        System.out.println(TD + "\n");

        System.out.println("TD.getPhones(\"Симонов\")");
        TD.getPhones("Симонов");
        System.out.println();

        System.out.println("TD.getPhones(\"Кузнецов\")");
        TD.getPhones("Кузнецов");
        System.out.println();

        System.out.println("TD.getPhones(\"Пушкин\")");
        TD.getPhones("Пушкин");

    }
}
