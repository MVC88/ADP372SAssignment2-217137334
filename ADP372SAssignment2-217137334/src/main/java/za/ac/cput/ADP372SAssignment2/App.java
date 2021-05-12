package za.ac.cput.ADP372SAssignment2;



import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */




public class App  {

    private List<String> listA;

    public App() {
        listA = new ArrayList<String>();
        listA.add("Cat");
        listA.add("Snake");
        listA.add("Bird");

    }

    public List<String> getList() {
        return listA;
    }

}
