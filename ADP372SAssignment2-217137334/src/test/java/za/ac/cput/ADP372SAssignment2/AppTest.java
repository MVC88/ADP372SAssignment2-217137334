package za.ac.cput.ADP372SAssignment2;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;


/**
 * Unit test for simple App.
 */
public class AppTest 
{

    List listA = new ArrayList();


    /**
     * Rigorous Test :-)
     */



    @Test
    public void add()
    {
        listA.add(0,"dog");

        assert(listA).contains("dog");
    }

    @Test
    public void remove()
    {
        listA.add(0,"dog");

        listA.remove(0);
        assert(listA.isEmpty());


    }


}
