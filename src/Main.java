public class Main {
    public static void main(String[] args) {
        //1
        Superhero one = Factory.createWolverine();
        Superhero two = Factory.createWolverine();

        Superhero superhero = Factory.createSuperman();
        Superhero superhero2 = Factory.createSuperman();
        //2
//        Superhero superhero = Factory.createAquaman();
//        Superhero superhero2 = Factory.createWolverine();
        //3
//        Superhero superhero = Factory.createHulk();
//        Superhero superhero2 = Factory.createSuperman();
        //4
//        Superhero superhero = Factory.createSuperman();
//        Superhero superhero2 = Factory.createSuperman();

        //5
//        Superhero superhero = Factory.createSuperman();
//        Superhero superhero2 = Factory.createWolverine();
        //6
//        Superhero superhero = Factory.createSuperman();
//        Superhero superhero2 = Factory.createHulk();

        fight(one, two,superhero,superhero2);
    }

    public static void fight(Superhero one, Superhero two,Superhero superhero,Superhero superhero2) {
        int countHero = 0;
        int countEnemyHero = 0;
        //1
//        Superhero superhero = Factory.createSuperman();
//        Superhero superhero2 = Factory.createSuperman();
        //2
//        Superhero superhero = Factory.createSuperman();
//        Superhero superhero2 = Factory.createHulk();
        //3
//        Superhero superhero = Factory.createSuperman();
//        Superhero superhero2 = Factory.createWolverine();
        //4
//        Superhero superhero = Factory.createWolverine();
//        Superhero superhero2 = Factory.createWolverine();
        //5
//        Superhero superhero = Factory.createHulk();
//        Superhero superhero2 = Factory.createSuperman();
        //6
//        Superhero superhero = Factory.createAquaman();
//        Superhero superhero2 = Factory.createWolverine();
        while (true) {
            if (one.getHp() > 0 && superhero.getHp() > 0) {
                //��� �������� ������� ����
                if (one.getHp() > 0) {
                    int hpOne = superhero.getHp() - one.getStrengthLevel();
                    superhero.setHp(hpOne);
                    System.out.println("��� ��������: " + one.getName() + " �� ��� ���� ���������� ��������� ��: " + one.getStrengthLevel() + " � ����� ��������: " + superhero.getHp() + " hp");
                }
                //��������� �������� ������� ����
                if (superhero.getHp() > 0) {
                    int hpTwo = one.getHp() - superhero.getStrengthLevel();
                    one.setHp(hpTwo);
                    System.out.println("��� ��������: " + one.getName() + " ������� ����: " + superhero.getStrengthLevel() + " � ������ ��������� ��������: " + one.getHp() + " hp");
                }
                if(one.getHp() <= 50 && countHero == 0){
                    one.superPower();
                    countHero++;
                }
                if(superhero.getHp() <= 50 && countEnemyHero == 0){
                    superhero.superPower();
                    countEnemyHero++;
                }
                if (one.getHp() <= 0) {
                    System.out.println("��� �������� ����");
                    System.out.println("������� ��� 2 ��������");
                    countHero = 0;
                }
                if (superhero.getHp() <= 0) {
                    System.out.println("���� ��������� ��������");
                    System.out.println("������� 2 �������� �����");
                    countEnemyHero=0;
                }
            } else if (one.getHp() > 0 && superhero.getHp() <= 0 && superhero2.getHp() > 0) {
                //��� �������� ������� ����
                if (one.getHp() > 0) {
                    int hpOne = superhero2.getHp() - one.getStrengthLevel();
                    superhero2.setHp(hpOne);
                    System.out.println("��� ��������: " + one.getName() + " �� ��� ���� ���������� ��������� ��: " + one.getStrengthLevel() + " � ����� ��������: " + superhero2.getHp() + " hp");
                }
                //��������� �������� ������� ����
                if (superhero2.getHp() > 0) {
                    int hpTwo = one.getHp() - superhero2.getStrengthLevel();
                    one.setHp(hpTwo);
                    System.out.println("��� ��������: " + one.getName() + " ������� ����: " + superhero2.getStrengthLevel() + " � ������ ��������� ��������: " + one.getHp() + " hp");
                }
                if(one.getHp() <= 50 && countHero == 0){
                    one.superPower();
                    countHero++;
                }
                if(superhero2.getHp() <= 50 && countEnemyHero == 0){
                    superhero2.superPower();
                    countEnemyHero++;
                }
                if (superhero2.getHp() <= 0) {
                    System.out.println("���� ��������� ��������");
                    countEnemyHero = 0;
                }
                if (one.getHp() <= 0) {
                    System.out.println("��� �������� ����");
                    System.out.println("������� ��� 2 ��������");
                    countHero = 0;
                }
            } else if (one.getHp() <= 0 && superhero.getHp() > 0 && two.getHp() > 0) {
                //��� �������� ������� ����
                if (two.getHp() > 0) {
                    int hpOne = superhero.getHp() - two.getStrengthLevel();
                    superhero.setHp(hpOne);
                    System.out.println("��� ��������: " + two.getName() + " �� ��� ���� ���������� ��������� ��: " + two.getStrengthLevel() + " � ����� ��������: " + superhero.getHp() + " hp");
                }
                //��������� �������� ������� ����
                if (superhero.getHp() > 0) {
                    int hpTwo = two.getHp() - superhero.getStrengthLevel();
                    two.setHp(hpTwo);
                    System.out.println("��� ��������: " + two.getName() + " ������� ����: " + superhero.getStrengthLevel() + " � ������ ��������� ��������: " + two.getHp() + " hp");
                }
                if(two.getHp() <= 50 && countHero == 0){
                    two.superPower();
                    countHero++;
                }
                if(superhero.getHp() <= 50 && countEnemyHero == 0){
                    superhero.superPower();
                    countEnemyHero++;
                }
                if (two.getHp() <= 0) {
                    System.out.println("��� �������� ����");
                    countHero = 0;
                }
                if (superhero.getHp() <= 0) {
                    System.out.println("���� ��������� ��������");
                    countEnemyHero = 0;
                }
            } else if (one.getHp() <= 0 && superhero.getHp() <= 0 && superhero2.getHp() > 0 && two.getHp() > 0) {
                //��� �������� ������� ����
                if (two.getHp() > 0) {
                    int hpOne = superhero2.getHp() - two.getStrengthLevel();
                    superhero2.setHp(hpOne);
                    System.out.println("��� ��������: " + two.getName() + " �� ��� ���� ���������� ��������� ��: " + two.getStrengthLevel() + " � ����� ��������: " + superhero2.getHp() + " hp");
                }
                //��������� �������� ������� ����
                if (superhero2.getHp() > 0) {
                    int hpTwo = two.getHp() - superhero2.getStrengthLevel();
                    two.setHp(hpTwo);
                    System.out.println("��� ��������: " + two.getName() + " ������� ����: " + superhero2.getStrengthLevel() + " � ������ ��������� ��������: " + two.getHp() + " hp");
                }
                if(two.getHp() <= 50 && countHero == 0){
                    two.superPower();
                    countHero++;
                }
                if(superhero2.getHp() <= 50 && countEnemyHero == 0){
                    superhero2.superPower();
                    countEnemyHero++;
                }
                if (superhero2.getHp() <= 0) {
                    System.out.println("���� ��������� ��������");
                    countEnemyHero = 0;
                }
                if (two.getHp() <= 0) {
                    System.out.println("��� �������� ����");
                    countHero = 0;
                }
            } else if (one.getHp() <= 0 && two.getHp() <= 0) {
                System.out.println("�� ���������");
                break;
            } else if (superhero.getHp() <= 0 && superhero2.getHp() <= 0) {
                System.out.println("�� ��������");
                break;
            }
        }
    }
}