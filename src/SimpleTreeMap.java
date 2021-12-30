import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class SimpleTreeMap{
    private TreeMap<String, Integer> elements;

    public SimpleTreeMap() {
        elements = new TreeMap<>();
    }

    public String getElement(String key) {
        if (elements.containsKey(key))
            return (key + " = " + elements.get(key));
        else
            return "Not exist element.";
    }

    public TreeMap<String, Integer> getElements() {
        return elements;
    }

    public void setElements(ArrayList <String> elements) {
        for (String s : elements) {
            this.addElement(s);
        }
    }

    public void addElement(String key) {
        if (elements.containsKey(key))
            elements.put(key, (elements.get(key)+1));
        else
            elements.put(key,1);
    }

    public void setElements(HashMap<String, Integer> elements) {
        this.elements.putAll(elements);
    }

    @Override
    public String toString() {
        return "SimpleTreeMap {" +
                "elements=" + elements +
                '}';
    }
}
