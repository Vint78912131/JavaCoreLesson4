import java.util.ArrayList;
import java.util.Collections;

public class SimpleArrayList{
    private ArrayList<String> elements;

    public SimpleArrayList() {
        elements = new ArrayList<>();
    }

    public String getElement(int i) {
        if (i > this.elements.size())
            return "Out of bound index.";
        else
            return this.elements.get(i);
    }

    public void setElement(int i, String element) {
        if (i > this.elements.size())
            System.out.println("Out of bound index");
        else
            this.elements.set(i,element);
    }

    public void addElement(String s) {
        this.elements.add(s);
    }

    public ArrayList<String> getElements() {
        return elements;
    }

    public void setElements(ArrayList<String> elements) {
        this.elements = elements;
    }

    public void sortABC() {
        Collections.sort(elements);
    }

    @Override
    public String toString() {
        return "SimpleArrayList {" +
                "elements=" + elements +
                '}';
    }
}
