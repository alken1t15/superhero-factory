public class Factory {
    final static String LABEL_MARVEL = "Marvel";
    final static String LABEL_DC = "DC";

    public static Superhero createBatman() {
        return new Superhero("������", 3, LABEL_DC, "���, � ������!" ,250_000);
    }

    public static Superhero createAquaman() {
        return new Superhero("�������", 5, LABEL_DC, "���, � �������!",500_000);
    }

    public static Superhero createHulk() {
        return new Superhero("����", 6, LABEL_MARVEL, "���, � ����!",700_000);
    }

    public static Superhero createSpiderMan() {
        return new Superhero("�������-����", 4, LABEL_MARVEL, "���, � �������-����!",300_000);
    }

    public static Superhero createWolverine() {
        return new Superhero("��������", 9, LABEL_DC, "���, � ��������!",1_000_000);
    }

    public static Superhero createSuperman() {
        return new Superhero("C�������", 2, LABEL_DC, "���, � ��������!",200_000);
    }

}