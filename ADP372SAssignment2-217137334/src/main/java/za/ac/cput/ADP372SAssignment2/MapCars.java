package za.ac.cput.ADP372SAssignment2;

//Malcolm Camelo
// student number :217137334


import java.util.HashMap;
import java.util.Map;

public class MapCars {

    private Map<String, String> mapA;

    public MapCars()
    {

        mapA = new HashMap<>();
        mapA.put("Car1", "Jeep");
        mapA.put("Car2", "Porsche");
        mapA.put("Car3", "Lamborghini");
    }

    public Map<String, String> getMapA() {
        return mapA;
    }

}
