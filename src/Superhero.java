public class Superhero {
    private String name;
    private int strengthLevel;
    private String label;

    private int hp = 100;

    private String superPower;

    public Superhero(String name, int strengthLevel, String label, String superPower) {
        this.name = name;
        this.strengthLevel = strengthLevel;
        this.label = label;
        this.superPower = superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrengthLevel() {
        return strengthLevel;
    }

    public void setStrengthLevel(int strengthLevel) {
        this.strengthLevel = strengthLevel;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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
    public String toString() {
        return "Superhero{" +
                "name='" + name + '\'' +
                ", strengthLevel=" + strengthLevel +
                ", label='" + label + '\'' +
                ", superPower='" + superPower + '\'' +
                '}';
    }
}