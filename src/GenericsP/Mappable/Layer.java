package GenericsP.Mappable;

import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable> {
    List<T> listOfElements = new ArrayList<>();


    public Layer(T[] listOfElements) {
        this.listOfElements = new ArrayList<T>(List.of(listOfElements));
    }

    void renderList() {
        for (T t : listOfElements) {
            t.render();
        }
    }

    void addElements(T... t) {
        listOfElements.addAll(List.of(t));
    }
}
