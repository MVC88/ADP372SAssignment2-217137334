package za.ac.cput.ADP372SAssignment2;

//Malcolm Camelo
// student number :217137334


import org.junit.jupiter.api.Test;


import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SetAnimeTest {
    private SetAnime Anime;

    @Test
    public void setAdd()
    {
    Anime = new SetAnime();
    Set<SetAnime> setA = Anime.getAnimeSet();
    SetAnime ani = new SetAnime(1, "Steins;Gate");;// will be inserted in a position according to hash number
        setA.add(ani);
        assertTrue(setA.contains(ani));

    }

    @Test
    public void setRemove()
    {
        Anime = new SetAnime();
        Set<SetAnime> setA = Anime.getAnimeSet();
        setA.remove("Gintama");
        assertFalse(setA.contains("Gintama"));
    }

@Test
    public void setFind()
{
    Anime = new SetAnime();
    Set<SetAnime> setA = Anime.getAnimeSet();
    Stream<SetAnime> found = setA.stream().filter(SetAnime -> "Chainsaw man".equals(SetAnime.getName()));
    found.forEach(s -> System.out.println(s));
}


}