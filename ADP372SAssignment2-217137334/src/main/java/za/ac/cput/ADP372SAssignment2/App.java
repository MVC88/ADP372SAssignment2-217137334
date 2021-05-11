package za.ac.cput.ADP372SAssignment2;



import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;

/**
 * Hello world!
 *
 */




public class App extends ArrayList<Object> {
    private String name;
    List listA = new ArrayList();

    public App(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return null;
    }
}
