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
        System.out.println("Сегодня в магазине находятся данные карточки: ");
        for(int i = 0; i<superheroArrayList.size();i++){
            Superhero superhero = superheroArrayList.get(i);
            System.out.println("Название персонажа: " + superhero.getName() + " его номер: "+  i +" его сила: " + superhero.getStrengthLevel() + " его стоимость: " + superhero.getPrice());
        }
    }

    public static void buyHeroes(Account account){
        boolean status = true;
        System.out.println("Введите команду /buy для покупки");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (status){
                String command = bufferedReader.readLine();
                switch (command){
                    case "/buy":
                        System.out.println("Введите номер персонажа");
                        String index = bufferedReader.readLine();
                        Superhero superhero = superheroArrayList.get(Integer.parseInt(index));
                        if(superhero!= null){
                            if (account.getMoney()>= superhero.getPrice()){
                                account.setSuperheroes(superhero);
                                System.out.println("Вы купили персонажа");
                            }
                            else {
                                System.out.println("У вас не хватает денег на персонажа");
                            }
                        }
                        else {
                            System.out.println("Такого персонажа нету");
                        }
                         break;
                    case "/exit":
                             status = false;
                             break;
                    case "/showHeroesInShop":
                        showHeroesShop();
                        break;
                    default:
                        System.out.println("Чтобы выйти введите .exit");
                        System.out.println("Чтобы посмотреть каталог персонажей введите /showHeroesInShop");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}