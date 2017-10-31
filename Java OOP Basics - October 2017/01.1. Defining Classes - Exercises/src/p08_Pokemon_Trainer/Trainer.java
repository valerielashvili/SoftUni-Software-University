package p08_Pokemon_Trainer;

import java.util.ArrayList;
import java.util.List;

class Trainer {
    private static final int DEFAULT_BADGES_COUNT = 0;

    private String name;
    private int badges;
    private List<Pokemon> pokemons;

    Trainer(String name) {
        this.name = name;
        this.badges = DEFAULT_BADGES_COUNT;
        this.pokemons = new ArrayList<>();
    }

    void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    void checkForElement(String element) {
        boolean elementIsFound = this.pokemons.stream().anyMatch(p -> p.getElement().equals(element));
        if (elementIsFound) {
            this.badges += 1;
        } else {
            this.pokemons.forEach(Pokemon::decreasePokemonsHealth);
            for (int i = 0; i <= this.pokemons.size() - 1; i++) {
                if (this.pokemons.get(i).getHealth() <= 0) {
                    this.pokemons.remove(i);
                }
            }
        }
    }

    int getBadges() {
        return this.badges;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", this.name, this.badges, this.pokemons.size());
    }
}
