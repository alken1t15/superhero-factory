public class Factory {
    final static String LABEL_MARVEL = "Marvel";
    final static String LABEL_DC = "DC";

    public static Superhero createBatman() {
        return new Superhero("Бэтмэн", 3, LABEL_DC, "Ааа, я бэтмэн!");
    }

    public static Superhero createAquaman() {
        return new Superhero("Аквамэн", 5, LABEL_DC, "Ааа, я аквамэн!");
    }

    public static Superhero createHulk() {
        return new Superhero("Халк", 6, LABEL_MARVEL, "Ааа, я халк!");
    }

    public static Superhero createSpiderMan() {
        return new Superhero("Человек-паук", 4, LABEL_MARVEL, "Ааа, я человек-паку!");
    }

    public static Superhero createWolverine() {
        return new Superhero("Росомаха", 9, LABEL_DC, "Ааа, я росомаха!");
    }

    public static Superhero createSuperman() {
        return new Superhero("Cупермен", 2, LABEL_DC, "Ааа, я супермен!");
    }

}