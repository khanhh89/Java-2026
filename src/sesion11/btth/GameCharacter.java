package sesion11.btth;

abstract class GameCharacter {
    private String name;
    private int hp;
    private int attackPower;
    private static int count = 0;

    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        //tăng biến count
        count++;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public static int getCount() {
        return count;
    }
    //mỗi nhân vật có cách đánh riêng
    public abstract void attack(GameCharacter taget);
    //giảm hp khi bị đánh
    public void tackDame(int amount){
        hp -= amount;
        if (hp < 0) {
            hp = 0;
        }
    }
    //hiển thị thông tin nhân vật
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        System.out.println("Attack Power: " + attackPower);
    }
    protected abstract void useUltimate(GameCharacter target);

}

