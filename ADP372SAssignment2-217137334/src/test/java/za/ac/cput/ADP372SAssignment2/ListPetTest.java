package za.ac.cput.ADP372SAssignment2;

//Malcolm Camelo
// student number :217137334

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import java.util.List;
import java.util.stream.Stream;


/**
 * Unit test for ListPet.
 */

class ListPetTest {
    private ListPet Pets;

    @Test
    public void listAdd() {  //Add
        Pets = new ListPet();
        List<ListPet> listA = Pets.getList();
        ListPet pet2 = new ListPet(2, "dog", 1);
        listA.add(pet2);
        assert (listA).contains(pet2);
    }

    @Test
    public void listRemove() { //Remove
        Pets = new ListPet();
        List<ListPet> listA = Pets.getList();
        listA.remove(2);
        assertEquals(2, listA.size());

    }

    @Test
    public void listFind() { //Find
        Pets = new ListPet();
        List<ListPet> listA = Pets.getList();
        Stream<ListPet> found = listA.stream().filter(listPet -> "bird".equals(listPet.getName()));
        found.forEach(s -> System.out.println(s));


    }


}
