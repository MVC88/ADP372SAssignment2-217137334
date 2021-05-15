package za.ac.cput.ADP372SAssignment2;

//Malcolm Camelo
// student number :217137334

import java.util.ArrayList;
import java.util.List;


public class ListPet {

    private List<ListPet> listA;

    int num;
    String name;
    int age;

    ListPet(int num, String name, int age) {
        this.num = num;
        this.name = name;
        this.age = age;
    }


    public ListPet() {
        listA = new ArrayList<>();
        listA.add(new ListPet(1, "fish", 1));
        listA.add(new ListPet(5, "snake", 1));
        listA.add(new ListPet(8, "bird", 1));
    }


    public String getName() {
        return name;
    }


    public List<ListPet> getList() {
        return listA;
    }

    @Override
    public String toString() {
        return "ListPet{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
