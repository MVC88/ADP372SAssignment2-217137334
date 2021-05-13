package za.ac.cput.ADP372SAssignment2;

import org.junit.jupiter.api.Test;


import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetAnimeTest {
    private SetAnime Anime;

    @Test
    public void setAdd()
    {
    Anime = new SetAnime();
    Set<String> setA = Anime.getAnimeSet();
    setA.add("Steins Gate");
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


}