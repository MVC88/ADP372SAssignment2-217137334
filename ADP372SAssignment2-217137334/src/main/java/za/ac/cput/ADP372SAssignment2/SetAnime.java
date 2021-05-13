package za.ac.cput.ADP372SAssignment2;
//Malcolm Camelo
// student number :217137334


import java.util.HashSet;

import java.util.Set;

public class SetAnime {
    private Set<String> animeSet;

    public SetAnime()
    {

         animeSet = new HashSet<>();

        animeSet.add("One Piece");
        animeSet.add("Gintama");
        animeSet.add("Hunter X Hunter");
        animeSet.add("Attack on Titan");
        animeSet.add("Demon Slayer");

      }

    public Set<String> getAnimeSet() {
        return animeSet;
    }
}
