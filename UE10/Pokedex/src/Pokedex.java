public class Pokedex {
    public static void main(String[] args) {

        Pokemon[] pokedex = new Pokemon[5];

        pokedex[0] = new DragonPokemon("Dratini", 50, 64, 45, 50, "Drachenzorn");
        pokedex[1] = new DragonPokemon("Altaria", 75, 70, 90, 80, "Drachentanz");
        pokedex[2] = new WaterPokemon("Schiggy", 44, 48, 65, 43, "Aquaknarre");
        pokedex[3] = new PsychicPokemon("Abra", 25, 20, 15, 90, "Magic Guard", 0.26);
        pokedex[4] = new WaterPokemon("Tentoxa", 80, 70, 65, 100, "Blubber");

        for (int i = 0; i < 5; i++) {
            System.out.println(pokedex[i]);

        }
    }
}



interface SpezialAttacke {
    String getSpezialAttacke();
}



abstract class Pokemon {
    String name;
    int hp;
    int angriff;
    int verteidigung;
    int geschwindigkeit;

    public Pokemon(String name, int hp, int angriff, int verteidigung, int geschwindigkeit) {
        this.name = name;
        this.hp = hp;
        this.angriff = angriff;
        this.verteidigung = verteidigung;
        this.geschwindigkeit = geschwindigkeit;
    }

    @Override
    public String toString() {
        return name + " - HP: " + hp + ", Angriff: " + angriff + ", Verteidigung: " + verteidigung + ", Geschwindigkeit: " + geschwindigkeit;
    }
}



class DragonPokemon extends Pokemon implements SpezialAttacke {
    String spezialAttacke;

    public DragonPokemon(String name, int hp, int angriff, int verteidigung, int geschwindigkeit, String spezialAttacke) {
        super(name, hp, angriff, verteidigung, geschwindigkeit);
        this.spezialAttacke = spezialAttacke;
    }

    @Override
    public String getSpezialAttacke() {
        return spezialAttacke;
    }

    @Override
    public String toString() {
        return super.toString() + ", Spezialattacke: " + spezialAttacke;
    }
}



class WaterPokemon extends Pokemon implements SpezialAttacke {
    String spezialAttacke;

    public WaterPokemon(String name, int hp, int angriff, int verteidigung, int geschwindigkeit, String spezialAttacke) {
        super(name, hp, angriff, verteidigung, geschwindigkeit);
        this.spezialAttacke = spezialAttacke;
    }

    @Override
    public String getSpezialAttacke() {
        return spezialAttacke;
    }

    @Override
    public String toString() {
        return super.toString() + ", Spezialattacke: " + spezialAttacke;
    }
}



class PsychicPokemon extends Pokemon implements SpezialAttacke {
    String spezialAttacke;
    double catchRate;

    public PsychicPokemon(String name, int hp, int angriff, int verteidigung, int geschwindigkeit, String spezialAttacke, double catchRate){
        super(name, hp, angriff, verteidigung, geschwindigkeit);
        this.spezialAttacke = spezialAttacke;
        this.catchRate = catchRate;
    }

    @Override
    public String getSpezialAttacke() {
        return spezialAttacke;
    }

    @Override
    public String toString() {
        return super.toString() + ", Spezialattacke: " + spezialAttacke + ", Catch Rate: " + catchRate;
    }
}
