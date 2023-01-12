public class Factory {
    final static String LABEL_MARVEL = "Marvel";
    final static String LABEL_DC = "DC";

    public static Superhero createBatman() {
        return new Superhero("Бэтмэн", 3, LABEL_DC, "Ааа, я бэтмэн!" ,250_000);
    }

    public static Superhero createAquaman() {
        return new Superhero("Аквамэн", 5, LABEL_DC, "Ааа, я аквамэн!",500_000);
    }

    public static Superhero createHulk() {
        return new Superhero("Халк", 6, LABEL_MARVEL, "Ааа, я халк!",700_000);
    }

    public static Superhero createSpiderMan() {
        return new Superhero("Человек-паук", 4, LABEL_MARVEL, "Ааа, я человек-паку!",300_000);
    }

    public static Superhero createWolverine() {
        return new Superhero("Росомаха", 9, LABEL_DC, "Ааа, я росомаха!",1_000_000);
    }

    public static Superhero createSuperman() {
        return new Superhero("Cупермен", 2, LABEL_DC, "Ааа, я супермен!",200_000);
    }

}