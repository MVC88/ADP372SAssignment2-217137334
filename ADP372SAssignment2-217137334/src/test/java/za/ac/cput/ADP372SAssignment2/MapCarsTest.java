package za.ac.cput.ADP372SAssignment2;

//Malcolm Camelo
// student number :217137334


import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MapCarsTest {
    private MapCars Cars;

    @Test
    public void MapAdd() {  //Add
        Cars = new MapCars();
        Map<String, String> mapA = Cars.getMapA();
        mapA.put("Car4", "Nissan");

        assert (mapA).containsKey("Car4");
    }

    @Test
    public void MapRemove() {  //remove according to key and object value
        Cars = new MapCars();
        Map<String, String> mapA = Cars.getMapA();
        mapA.remove("Car3", "Lamborghini");
        assertFalse(mapA.containsValue("Lamborghini"));
    }

    @Test
    public void MapFind() { //Find
        Cars = new MapCars();
        Map<String, String> mapA = Cars.getMapA();
        boolean found = mapA.containsKey("Car1");
        assertTrue(found);

    }


}