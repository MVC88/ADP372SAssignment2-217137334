package za.ac.cput.ADP372SAssignment2;

//Malcolm Camelo
// student number :217137334

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;



/**
 * Unit test for ListPet.
 */

public class ListPetTest {
    private ListPet Apps;

    @Test
    public void listAdd() {  //Add
        Apps = new ListPet();
        List<ListPet> listA = Apps.getList();
        ListPet pet2 = new ListPet(2, "dog", 1);
        listA.add(pet2);
        assert (listA).contains(pet2);
    }

    @Test
    public void listRemove() { //Remove
        Apps = new ListPet();
        List<ListPet> listA = Apps.getList();
        listA.remove(2);
        assertEquals(2, listA.size());

    }

    @Test
    public void listFind() { //Find
        Apps = new ListPet();
        List<ListPet> listA = Apps.getList();
        boolean found = listA.contains(listA.get(2));
        assertTrue(found);

    }


}
