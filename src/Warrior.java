// Warrior Class implementing RPG_Character
class Warrior implements RPG_Character {
    private String name;
    private int health;
    private int attackPower;
    private int defense;

    public Warrior(String name) {
        this.name = name;
        this.health = 100;  // พลังชีวิตเริ่มต้น
        this.attackPower = 20;  // พลังโจมตีเริ่มต้น
        this.defense = 10;  // พลังป้องกันเริ่มต้น
    }

    @Override
    public void attack(RPG_Character target) {
        System.out.println(name + " attacks!");
        int damage = attackPower; // ใช้พลังโจมตีของนักรบ
        target.defend(damage); // ส่งความเสียหายไปให้ฝ่ายตรงข้าม
    }

    @Override
    public void defend(int damage) {
        // คำนวณความเสียหายที่ได้รับ
        int actualDamage = Math.max(damage - defense, 0); // หักค่าพลังป้องกัน
        health -= actualDamage; // ลดพลังชีวิต
        System.out.println(name + " defends! Health is now: " + health);
    }

    @Override
    public void levelUp() {
        attackPower += 5;
        defense += 3;
        health += 20;
        System.out.println(name + " levels up! New stats: Health=" + health + ", Attack=" + attackPower + ", Defense=" + defense);
    }

    @Override
    public void showStatus() {
        System.out.println("Warrior " + name + ": Health=" + health + ", Attack=" + attackPower + ", Defense=" + defense);
        System.out.println("");
    }
}
