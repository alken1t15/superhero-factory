public class Factory {
    final static String LABEL_MARVEL = "Marvel";
    final static String LABEL_DC = "DC";

    public static Superhero createBatman() {
        return new Superhero("Бэтмэн", 3, LABEL_DC, "Ààà, ÿ áýòìýí!");
    }

    public static Superhero createAquaman() {
        return new Superhero("Àêâàìýí", 5, LABEL_DC, "Ààà, ÿ àêâàìýí!");
    }

    public static Superhero createHulk() {
        return new Superhero("Õàëê", 6, LABEL_MARVEL, "Ààà, ÿ õàëê!");
    }

    public static Superhero createSpiderMan() {
        return new Superhero("×åëîâåê-ïàóê", 4, LABEL_MARVEL, "Ààà, ÿ ÷åëîâåê-ïàêó!");
    }

    public static Superhero createWolverine() {
        return new Superhero("Ðîñîìàõà", 9, LABEL_DC, "Ààà, ÿ ðîñîìàõà!");
    }

    public static Superhero createSuperman() {
        return new Superhero("Cóïåðìåí", 2, LABEL_DC, "Ààà, ÿ ñóïåðìåí!");
    }

}
