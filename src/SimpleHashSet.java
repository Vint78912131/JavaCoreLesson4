import java.util.HashSet;

public class SimpleHashSet {
    private HashSet<String> elements;

    public SimpleHashSet() {
        elements = new HashSet<>();
    }

    public boolean getElement(String word) {
        if (elements.contains(word))
            return true;
        else
            return false;
    }

    public void addElement(String word) {
        if (!elements.contains(word))
            elements.add(word);
    }

    public HashSet<String> getElements() {
        return elements;
    }

    public void setElements(HashSet<String> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "SimpleHashSet {" +
                "elements=" + elements +
                '}';
    }
}
