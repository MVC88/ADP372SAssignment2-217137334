package za.ac.cput.ADP372SAssignment2;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import java.util.List;
import java.util.Optional;


/**
 * Unit test for simple App.
 */
public class AppTest
{
    private App Apps;

    @Test
    public void listAdd()
    {   Apps = new App();
        List<App> listA = Apps.getList();
        App pet2 =new App(2,"dog",1);
        listA.add(pet2);
        assert(listA).contains(pet2);
    }

    @Test
    public void listRemove()
    {
        Apps = new App();
        List<App> listA = Apps.getList();
        listA.remove(2);
        assertEquals(2,listA.size());

    }
@Test
    public void listFind()
{
    Apps = new App();
    List<App> listA = Apps.getList();
     boolean found = listA.contains(listA.get(2));
     assertEquals(true,found);

}


}
