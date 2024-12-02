// RPG_Character Interface
interface RPG_Character {
    void attack(RPG_Character target);  // เมธอดโจมตี
    void defend(int damage);  // เมธอดป้องกันจากการโจมตี
    void levelUp();  // เมธอดเพิ่มเลเวล
    void showStatus();  // เมธอดแสดงสถานะ
}


