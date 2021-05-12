package za.ac.cput.ADP372SAssignment2;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
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
        List<String> listA = Apps.getList();
        listA.add("dog");
        assert(listA).contains("dog");
    }

    @Test
    public void listRemove()
    {
        Apps = new App();
        List<String> listA = Apps.getList();
        listA.remove(2);
        assertEquals(2,listA.size());

    }
@Test
    public void listFind()
{
    Apps = new App();
    List<String> listA = Apps.getList();
    int found = listA.indexOf("Snake");
     assertEquals(1,found);

}


}
