import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Shop {
    private static ArrayList<Superhero> superheroArrayList = new ArrayList<>();
    private static void generateHeroes(){
        int count = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        int randomHeroesInShop = 0;
        while (randomHeroesInShop == 0) {
            randomHeroesInShop = (int) (Math.random() * 5);
        }
        while (count != randomHeroesInShop){
            int randomNumber =(int) (Math.random() *5);
            if (!hashSet.contains(randomNumber)){
                hashSet.add(randomNumber);
                switch (randomNumber) {
                    case 0 -> superheroArrayList.add(Factory.createSpiderMan());
                    case 1 -> superheroArrayList.add(Factory.createWolverine());
                    case 2 -> superheroArrayList.add(Factory.createAquaman());
                    case 3 -> superheroArrayList.add(Factory.createSuperman());
                    case 4 -> superheroArrayList.add(Factory.createHulk());
                    case 5 -> superheroArrayList.add(Factory.createBatman());
                }
                count++;
            }
        }
    }

    public static void showHeroesShop(){
        generateHeroes();
        System.out.println("������� � �������� ��������� ������ ��������: ");
        for(int i = 0; i<superheroArrayList.size();i++){
            Superhero superhero = superheroArrayList.get(i);
            System.out.println("�������� ���������: " + superhero.getName() + " ��� �����: "+  i +" ��� ����: " + superhero.getStrengthLevel() + " ��� ���������: " + superhero.getPrice());
        }
    }

    public static void buyHeroes(Account account){
        boolean status = true;
        System.out.println("������� ������� /buy ��� �������");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (status){
                String command = bufferedReader.readLine();
                switch (command){
                    case "/buy":
                        System.out.println("������� ����� ���������");
                        String index = bufferedReader.readLine();
                        Superhero superhero = superheroArrayList.get(Integer.parseInt(index));
                        if(superhero!= null){
                            if (account.getMoney()>= superhero.getPrice()){
                                account.setSuperheroes(superhero);
                                System.out.println("�� ������ ���������");
                            }
                            else {
                                System.out.println("� ��� �� ������� ����� �� ���������");
                            }
                        }
                        else {
                            System.out.println("������ ��������� ����");
                        }
                         break;
                    case "/exit":
                             status = false;
                             break;
                    case "/showHeroesInShop":
                        showHeroesShop();
                        break;
                    default:
                        System.out.println("����� ����� ������� .exit");
                        System.out.println("����� ���������� ������� ���������� ������� /showHeroesInShop");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}