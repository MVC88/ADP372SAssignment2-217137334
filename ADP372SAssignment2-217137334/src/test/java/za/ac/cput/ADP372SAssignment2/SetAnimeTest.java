package za.ac.cput.ADP372SAssignment2;

//Malcolm Camelo
// student number :217137334


import org.junit.jupiter.api.Test;


import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetAnimeTest {
    private SetAnime Anime;

    @Test
    public void setAdd()
    {
    Anime = new SetAnime();
    Set<String> setA = Anime.getAnimeSet();
    setA.add("Steins Gate");// will be inserted in a position according to hash number
    assertTrue(setA.contains("Steins Gate"));
    System.out.println(setA);
    }

    @Test
    public void setRemove()
    {
        Anime = new SetAnime();
        Set<String> setA = Anime.getAnimeSet();
        setA.remove("Gintama");
        assertFalse(setA.contains("Gintama"));
    }

@Test
    public void setFind()
{
    Anime = new SetAnime();
    Set<String> setA = Anime.getAnimeSet();
    Optional<String> found = setA.stream().findFirst();
    System.out.println(found);
}


}