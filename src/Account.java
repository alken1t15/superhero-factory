import javax.security.auth.login.AccountException;
import java.util.ArrayList;
import java.util.Objects;

public class Account {
    private String login;
    private String password;
    private String nickName;
    private long money;
    private ArrayList<Superhero> superheroes;

    public Account(String login, String password, String nickName) {
        if(!login.isEmpty() && login != null && !password.isEmpty() && password != null && !nickName.isEmpty() && nickName!= null){
            this.login = login;
            this.password = password;
            this.nickName = nickName;
            money = 200000;
            superheroes = new ArrayList<>();
        }
        else {
            try {
                throw new AccountException("Значения должны быть заполнены!!");
            } catch (AccountException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if(!login.isEmpty() && login != null) {
            this.login = login;
        }
        else {
            try {
                throw new AccountException("Значения должны быть заполнены!!");
            } catch (AccountException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (!password.isEmpty() && password != null) {
            this.password = password;
        }
        else {
            try {
                throw new AccountException("Значения должны быть заполнены!!");
            } catch (AccountException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        if(!nickName.isEmpty() && nickName!= null) {
            this.nickName = nickName;
        }
        else {
            try {
                throw new AccountException("Значения должны быть заполнены!!");
            } catch (AccountException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public ArrayList<Superhero> getSuperheroes() {
        return superheroes;
    }

    public void setSuperheroes(ArrayList<Superhero> superheroes) {
        this.superheroes = superheroes;
    }

    public void setSuperheroes(Superhero superhero) {
        superheroes.add(superhero);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(getLogin(), account.getLogin()) && Objects.equals(getPassword(), account.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogin(), getPassword());
    }

    @Override
    public String toString() {
        return "Account{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", nickName='" + nickName + '\'' +
                ", money=" + money +
                ", superheroes=" + superheroes +
                '}';
    }
}