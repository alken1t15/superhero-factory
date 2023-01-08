public class Main {
    public static void main(String[] args) {
        Superhero superhero = Factory.createSpiderMan();
        Superhero superhero2 = Factory.createSpiderMan();

        fight(superhero, superhero2);
    }

    public static void fight(Superhero one, Superhero two) {
        int count = 0;
        Superhero superhero = Factory.createWolverine();
        Superhero superhero2 = Factory.createBatman();

        while (true) {
            if (one.getHp() > 0 && superhero.getHp() > 0) {
                int hpOne = superhero.getHp() - one.getStrengthLevel();
                superhero.setHp(hpOne);
                System.out.println("Ваш персонаж: " + one.getName() + " на нес урон вражескому персонажу на: " + one.getStrengthLevel() + " у врага осталось: " + superhero.getHp() + " hp");
                int hpTwo = one.getHp() - superhero.getStrengthLevel();
                one.setHp(hpTwo);
                System.out.println("Ваш персонаж: " + one.getName() + " получил урон: " + superhero.getStrengthLevel() + " у вашего персонажа осталось: " + one.getHp() + " hp");
                if (one.getHp() <= 0) {
                    System.out.println("Ваш персонаж умер");
                    System.out.println("Выходит ваш 2 персонаж");
                }
                if (superhero.getHp() <= 0) {
                    System.out.println("Умер вражеский персонаж");
                    System.out.println("Выходит 2 персонаж врага");
                }
            } else if (superhero.getHp() > 0 & one.getHp() < 0) {
                int hpOne = superhero.getHp() - two.getStrengthLevel();
                superhero.setHp(hpOne);
                System.out.println("Ваш персонаж: " + two.getName() + " на нес урон вражескому персонажу на: " + two.getStrengthLevel() + " у врага осталось: " + superhero.getHp() + " hp");
                int hpTwo = two.getHp() - superhero.getStrengthLevel();
                two.setHp(hpTwo);
                System.out.println("Ваш персонаж: " + two.getName() + " получил урон: " + superhero.getStrengthLevel() + " у вашего персонажа осталось: " + two.getHp() + " hp");
                if (superhero.getHp() <= 0) {
                    System.out.println("Умер вражеский персонаж");
                    System.out.println("Выходит 2 персонаж врага");
                }
            } else if (one.getHp() > 0 && superhero.getHp() < 0 && superhero2.getHp() > 0) {
                int hpOne = superhero2.getHp() - one.getStrengthLevel();
                superhero2.setHp(hpOne);
                System.out.println("Ваш персонаж: " + one.getName() + " на нес урон вражескому персонажу на: " + one.getStrengthLevel() + " у врага осталось: " + superhero2.getHp() + " hp");
                int hpTwo = one.getHp() - superhero.getStrengthLevel();
                one.setHp(hpTwo);
                System.out.println("Ваш персонаж: " + one.getName() + " получил урон: " + superhero2.getStrengthLevel() + " у вашего персонажа осталось: " + one.getHp() + " hp");
                if (superhero2.getHp() <= 0) {
                    System.out.println("Умер вражеский персонаж");
                }
                if (one.getHp() <= 0 && two.getHp() > 0) {
                    System.out.println("Ваш персонаж умер");
                    System.out.println("Выходит ваш 2 персонаж");
                }
            } else if (superhero2.getHp() > 0 && two.getHp() > 0 && one.getHp() <= 0) {
                int hpOne = superhero2.getHp() - two.getStrengthLevel();
                superhero2.setHp(hpOne);
                System.out.println("Ваш персонаж: " + two.getName() + " на нес урон вражескому персонажу на: " + two.getStrengthLevel() + " у врага осталось: " + superhero2.getHp() + " hp");
                int hpTwo = two.getHp() - superhero2.getStrengthLevel();
                two.setHp(hpTwo);
                System.out.println("Ваш персонаж: " + two.getName() + " получил урон: " + superhero2.getStrengthLevel() + " у вашего персонажа осталось: " + two.getHp() + " hp");
                if (two.getHp() <= 0) {
                    System.out.println("Ваш персонаж умер");
                }
                if (superhero2.getHp() <= 0) {
                    System.out.println("Умер вражеский персонаж");
                }
            } else if (one.getHp() <= 0 && two.getHp() <= 0) {
                System.out.println("Вы проиграли");
                break;
            } else if (superhero.getHp() <= 0 && superhero2.getHp() <= 0) {
                System.out.println("Вы выиграли");
                break;
            }
        }
    }
}