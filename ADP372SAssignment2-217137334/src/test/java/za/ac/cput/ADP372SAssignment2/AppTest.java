package za.ac.cput.ADP372SAssignment2;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * Unit test for simple App.
 */
public class AppTest
{

    List<String> listA = new ArrayList<>();








    /**
     * Rigorous Test :-)
     */



    @Test
    public void listAdd()
    {
        listA.add("dog");
        assert(listA).contains("dog");
    }

    @Test
    public void listRemove()
    {
        listA.add("dog");
        listA.remove(0);
        assert(listA).isEmpty();

    }
@Test
    public void listFind()
{


}

}
