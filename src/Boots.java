// Boots Class implementing Accessory
class Boots implements Accessory {
    private String type;
    private int defenseBoost;

    public Boots(String type) {
        this.type = type;
        if (type.equalsIgnoreCase("Warrior")) {
            this.defenseBoost = 15;  // เพิ่มพลังป้องกันให้ Warrior
        } else if (type.equalsIgnoreCase("Mage")) {
            this.defenseBoost = 5;  // เพิ่มพลังป้องกันให้ Mage
        }
    }

    @Override
    public void equip(RPG_Character character) {
        if (character instanceof Warrior) {
            Warrior warrior = (Warrior) character;
            warrior.showStatus();
            // อัพเดตพลังป้องกันของ Warrior
            System.out.println("Equipping " + type + " boots to " + warrior + "!");
            warrior.levelUp();  // เพิ่มพลังป้องกันให้นักรบ
        } else if (character instanceof Mage) {
            Mage mage = (Mage) character;
            mage.showStatus();
            // อัพเดตพลังป้องกันของ Mage
            System.out.println("Equipping " + type + " boots to " + mage + "!");
            mage.levelUp();  // เพิ่มพลังป้องกันให้ Mage
        }
    }

    @Override
    public void showEffect() {
        System.out.println("Boots effect: defense boost=" + defenseBoost);
        System.out.println();
    }
}
