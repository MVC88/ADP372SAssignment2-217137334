package za.ac.cput.ADP372SAssignment2;
//Malcolm Camelo
// student number :217137334


import java.util.HashSet;

import java.util.Set;

public class SetAnime {
    private Set<SetAnime> animeSet;

    int Rank;
    String name;

    public SetAnime(int rank, String name) {
        Rank = rank;
        this.name = name;
    }

    public SetAnime() {

        animeSet = new HashSet<>();

        animeSet.add(new SetAnime(1, "One Piece"));
        animeSet.add(new SetAnime(2, "Gintama"));
        animeSet.add(new SetAnime(3, "Attack on titan"));
        animeSet.add(new SetAnime(4, "Chainsaw man"));
        animeSet.add(new SetAnime(5, "Demon Slayer"));

    }

    public Set<SetAnime> getAnimeSet() {
        return animeSet;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SetAnime{" +
                "Rank=" + Rank +
                ", name='" + name + '\'' +
                '}';
    }
}
