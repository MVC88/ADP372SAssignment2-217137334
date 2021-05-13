package za.ac.cput.ADP372SAssignment2;



import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */




public class App  {

    private List<App> listA;

    int num;
    String name;
    int age;
    App(int num,String name,int age){
        this.num=num;
        this.name=name;
        this.age=age;
    }



    public App() {









        listA = new ArrayList<App>();
        listA.add(new App(1,"fish",1));
        listA.add(new App(5,"snake",1));
        listA.add(new App(8,"bird",1));



    }

    public List<App> getList() {
        return listA;
    }


}
