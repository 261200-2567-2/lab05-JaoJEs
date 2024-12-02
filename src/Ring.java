// Ring Class implementing Accessory
class Ring implements Accessory {
    private String type;
    private int healthBoost;
    private int magicBoost;

    public Ring(String type) {
        this.type = type;
        if (type.equalsIgnoreCase("Warrior")) {
            this.healthBoost = 30;  // เพิ่มพลังชีวิตให้ Warrior
            this.magicBoost = 0;  // ไม่มีผลกับพลังเวทย์
        } else if (type.equalsIgnoreCase("Mage")) {
            this.healthBoost = 10;  // เพิ่มพลังชีวิตให้ Mage
            this.magicBoost = 10;  // เพิ่มพลังเวทย์ให้ Mage
        }
    }

    @Override
    public void equip(RPG_Character character) {
        if (character instanceof Warrior) {
            Warrior warrior = (Warrior) character;
            warrior.showStatus();
            // อัพเดตพลังชีวิตของ Warrior
            System.out.println("Equipping " + type + " ring to " + warrior + "!");
            warrior.levelUp();  // เพิ่มพลังชีวิตให้นักรบ
        } else if (character instanceof Mage) {
            Mage mage = (Mage) character;
            mage.showStatus();
            // อัพเดตพลังชีวิตและพลังเวทย์ของ Mage
            System.out.println("Equipping " + type + " ring to " + mage + "!");
            mage.levelUp();  // เพิ่มพลังชีวิตและพลังเวทย์ให้ Mage
        }
    }

    @Override
    public void showEffect() {
        System.out.println("Ring effect: health boost=" + healthBoost + ", magic boost=" + magicBoost);
        System.out.println("");
    }
}
