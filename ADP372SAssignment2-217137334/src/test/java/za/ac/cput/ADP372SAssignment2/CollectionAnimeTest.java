package za.ac.cput.ADP372SAssignment2;

//Malcolm Camelo
// student number :217137334

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CollectionAnimeTest {

    private CollectionAnime anime;

    @Test
    public void ColAdd() {  //Add
        anime = new CollectionAnime();
        Collection<String> col1 = anime.getAnimeCollection();
        col1.add("Owarimonogatari");

        assert (col1).contains("Owarimonogatari");
    }


    @Test
    public void ColRemove() {  //Remove
        anime = new CollectionAnime();
        Collection<String> col1 = anime.getAnimeCollection();
        col1.remove("Code Geass: Lelouch of the Rebellion");
        assertFalse(col1.contains("Code Geass: Lelouch of the Rebellion"));
    }

    @Test
    public void ColFind() {  //find
        anime = new CollectionAnime();
        Collection<String> col1 = anime.getAnimeCollection();
        boolean found = col1.contains("Chainsaw man");
        assertTrue(found);

    }


}