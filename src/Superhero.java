import java.util.Objects;

public class Superhero {
    private String name;
    private int strengthLevel;
    private String label;
    private int hp = 100;
    private String superPower;

    private long price;

    public Superhero(String name, int strengthLevel, String label, String superPower,long price) {
        if (name != null && !name.isEmpty() && strengthLevel != 0 && label != null && !label.isEmpty() && superPower != null && !superPower.isEmpty()) {
            this.name = name;
            this.strengthLevel = strengthLevel;
            this.label = label;
            this.superPower = superPower;
            this.price = price;
        } else {
            try {
                throw new ExceptionSuperhero("???????? ?????? ???? ?????????");
            } catch (ExceptionSuperhero e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void setSuperPower(String superPower) {
        if (!superPower.isEmpty() && superPower != null) {
            this.superPower = superPower;
        } else {
            try {
                throw new ExceptionSuperhero("???????? ?????? ???? ?????????");
            } catch (ExceptionSuperhero e) {
                throw new RuntimeException(e);
            }
        }
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            try {
                throw new ExceptionSuperhero("???????? ?????? ???? ?????????");
            } catch (ExceptionSuperhero e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int getStrengthLevel() {
        return strengthLevel;
    }

    public void setStrengthLevel(int strengthLevel) {
        if (strengthLevel != 0) {
            this.strengthLevel = strengthLevel;
        } else {
            try {
                throw new ExceptionSuperhero("???????? ?????? ???? ?????????");
            } catch (ExceptionSuperhero e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        if (label != null && !label.isEmpty()) {
            this.label = label;
        } else {
            try {
                throw new ExceptionSuperhero("???????? ?????? ???? ?????????");
            } catch (ExceptionSuperhero e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void superPower() {
        System.out.println(superPower);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Superhero superhero = (Superhero) o;
        return getStrengthLevel() == superhero.getStrengthLevel() && Objects.equals(getName(), superhero.getName()) && Objects.equals(getLabel(), superhero.getLabel()) && Objects.equals(getSuperPower(), superhero.getSuperPower());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getStrengthLevel(), getLabel(), getSuperPower());
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "name='" + name + '\'' +
                ", strengthLevel=" + strengthLevel +
                ", label='" + label + '\'' +
                ", superPower='" + superPower + '\'' +
                '}';
    }
}