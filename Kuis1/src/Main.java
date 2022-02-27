
//player
class Player{
    String nama;
    double health;
    int level;

    //objek member
    Weapon weapon;
    Armor armor;

    Player(String nama, double health){
        this.nama = nama;
        this.health = health;
    }

    
    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName   : " + this.nama);
        System.out.println("Health : " + this.health + " Hp");
        this.weapon.display();
        this.armor.display();
    }
}

//senjata
class Weapon{
    double attackPower;
    String nama;
    //constructor
    Weapon(String nama, double attackPower){
        this.nama = nama;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon : " + this.nama + " , power : " + this.attackPower);
    }
}

//armor
class Armor{
    double defencePower;
    String nama;

    //constructor
    Armor(String nama, double defencePower){
        this.nama = nama;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor : " + this.nama + " , power : " + this.defencePower);
    }
}

public class Main {

    public static void main(String[] args) {

        //membuat objek dari player
        Player player1 = new Player("Budi", 100);
        Player player2 = new Player("Baba", 95);

        //membuat objek dari weapon
        Weapon pedang = new Weapon("Pedang", 15);
        Weapon panah = new Weapon("panah", 7);
        //membuat objek dari armor
        Armor bajuBesi = new Armor("baju besi",10);
        Armor singlet = new Armor("Singlet", 2);

        //equip senjata dan armor
        //player1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();
        //player2
        player2.equipWeapon(panah);
        player2.equipArmor(singlet);
        player2.display();

    }
}
