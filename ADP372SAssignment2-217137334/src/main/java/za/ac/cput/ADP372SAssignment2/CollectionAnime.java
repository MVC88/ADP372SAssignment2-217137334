package za.ac.cput.ADP372SAssignment2;

//Malcolm Camelo
// student number :217137334

import java.util.Collection;
import java.util.HashSet;

public class CollectionAnime {

    Collection<String> animeCollection ;


    public CollectionAnime()
    {

        animeCollection = new HashSet<>();
        animeCollection.add("Bleach");
        animeCollection.add("Code Geass: Lelouch of the Rebellion");
        animeCollection.add("Chainsaw man");
    }


    public Collection<String> getAnimeCollection() {
        return animeCollection;
    }



}
