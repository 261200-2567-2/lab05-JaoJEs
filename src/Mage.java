// Mage Class implementing RPG_Character
class Mage implements RPG_Character {
    private String name;
    private int health;
    private int magicPower;
    private int defense;

    public Mage(String name) {
        this.name = name;
        this.health = 80;  // พลังชีวิตเริ่มต้น
        this.magicPower = 30;  // พลังเวทย์เริ่มต้น
        this.defense = 5;  // พลังป้องกันเริ่มต้น
    }

    @Override
    public void attack(RPG_Character target) {
        System.out.println(name + " casts a spell!");
        int damage = magicPower; // ใช้พลังเวทย์ของนักเวทย์
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
        magicPower += 8;
        defense += 2;
        health += 15;
        System.out.println(name + " levels up! New stats: Health=" + health + ", Magic Power=" + magicPower + ", Defense=" + defense);
    }

    @Override
    public void showStatus() {
        System.out.println("Mage " + name + ": Health=" + health + ", Magic Power=" + magicPower + ", Defense=" + defense);
        System.out.println("");
    }
}
