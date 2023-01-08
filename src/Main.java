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
                System.out.println("��� ��������: " + one.getName() + " �� ��� ���� ���������� ��������� ��: " + one.getStrengthLevel() + " � ����� ��������: " + superhero.getHp() + " hp");
                int hpTwo = one.getHp() - superhero.getStrengthLevel();
                one.setHp(hpTwo);
                System.out.println("��� ��������: " + one.getName() + " ������� ����: " + superhero.getStrengthLevel() + " � ������ ��������� ��������: " + one.getHp() + " hp");
                if (one.getHp() <= 0) {
                    System.out.println("��� �������� ����");
                    System.out.println("������� ��� 2 ��������");
                }
                if (superhero.getHp() <= 0) {
                    System.out.println("���� ��������� ��������");
                    System.out.println("������� 2 �������� �����");
                }
            } else if (superhero.getHp() > 0 & one.getHp() < 0) {
                int hpOne = superhero.getHp() - two.getStrengthLevel();
                superhero.setHp(hpOne);
                System.out.println("��� ��������: " + two.getName() + " �� ��� ���� ���������� ��������� ��: " + two.getStrengthLevel() + " � ����� ��������: " + superhero.getHp() + " hp");
                int hpTwo = two.getHp() - superhero.getStrengthLevel();
                two.setHp(hpTwo);
                System.out.println("��� ��������: " + two.getName() + " ������� ����: " + superhero.getStrengthLevel() + " � ������ ��������� ��������: " + two.getHp() + " hp");
                if (superhero.getHp() <= 0) {
                    System.out.println("���� ��������� ��������");
                    System.out.println("������� 2 �������� �����");
                }
            } else if (one.getHp() > 0 && superhero.getHp() < 0 && superhero2.getHp() > 0) {
                int hpOne = superhero2.getHp() - one.getStrengthLevel();
                superhero2.setHp(hpOne);
                System.out.println("��� ��������: " + one.getName() + " �� ��� ���� ���������� ��������� ��: " + one.getStrengthLevel() + " � ����� ��������: " + superhero2.getHp() + " hp");
                int hpTwo = one.getHp() - superhero.getStrengthLevel();
                one.setHp(hpTwo);
                System.out.println("��� ��������: " + one.getName() + " ������� ����: " + superhero2.getStrengthLevel() + " � ������ ��������� ��������: " + one.getHp() + " hp");
                if (superhero2.getHp() <= 0) {
                    System.out.println("���� ��������� ��������");
                }
                if (one.getHp() <= 0 && two.getHp() > 0) {
                    System.out.println("��� �������� ����");
                    System.out.println("������� ��� 2 ��������");
                }
            } else if (superhero2.getHp() > 0 && two.getHp() > 0 && one.getHp() <= 0) {
                int hpOne = superhero2.getHp() - two.getStrengthLevel();
                superhero2.setHp(hpOne);
                System.out.println("��� ��������: " + two.getName() + " �� ��� ���� ���������� ��������� ��: " + two.getStrengthLevel() + " � ����� ��������: " + superhero2.getHp() + " hp");
                int hpTwo = two.getHp() - superhero2.getStrengthLevel();
                two.setHp(hpTwo);
                System.out.println("��� ��������: " + two.getName() + " ������� ����: " + superhero2.getStrengthLevel() + " � ������ ��������� ��������: " + two.getHp() + " hp");
                if (two.getHp() <= 0) {
                    System.out.println("��� �������� ����");
                }
                if (superhero2.getHp() <= 0) {
                    System.out.println("���� ��������� ��������");
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