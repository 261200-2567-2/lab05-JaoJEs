// Main Class for Interaction
public class RPGGame {
    public static void main(String[] args) {
        // สร้างตัวละคร
        Warrior warrior = new Warrior("Thor");
        Mage mage = new Mage("Gandalf");

        // แสดงสถานะของตัวละครก่อนอัพเลเวล
        System.out.println("Initial statuses:");
        warrior.showStatus();
        mage.showStatus();

        // การโจมตีระหว่างตัวละคร
        System.out.println("\nBattle begins!");
        warrior.attack(mage); // Thor โจมตี Gandalf
        mage.attack(warrior);  // Gandalf โจมตี Thor

        // การเพิ่มเลเวลให้ตัวละคร
        System.out.println("\nLeveling up characters...");
        warrior.levelUp();  // อัพเลเวลให้ Thor
        mage.levelUp();     // อัพเลเวลให้ Gandalf

        // แสดงสถานะหลังจากเพิ่มเลเวล
        System.out.println("\nFinal statuses after leveling up:");
        warrior.showStatus();
        mage.showStatus();

        // สวมแหวนให้ตัวละคร
        System.out.println("\nEquipping accessories...");
        Accessory warriorRing = new Ring("Warrior");
        Accessory mageRing = new Ring("Mage");
        warriorRing.equip(warrior);  // สวมแหวนให้ Warrior
        mageRing.equip(mage);        // สวมแหวนให้ Mage

        Accessory warriorBoots = new Boots("Warrior");
        Accessory mageBoots = new Boots("Mage");
        warriorBoots.equip(warrior);  // สวมรองเท้าให้ Warrior
        mageBoots.equip(mage);        // สวมรองเท้าให้ Mage

        // แสดงสถานะหลังจากสวมอุปกรณ์เสริม
        System.out.println("\nFinal statuses after equipping accessories:");
        warrior.showStatus();
        mage.showStatus();
    }
}
