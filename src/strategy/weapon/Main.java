package strategy.weapon;

public class Main {
    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter();
        gameCharacter.attack(); // Null 에러

        Weapon knife = new Knife();
        gameCharacter.setWeapon(knife);
        gameCharacter.attack();

        Weapon sword = new Sword();
        gameCharacter.setWeapon(sword);
        gameCharacter.attack();

        Weapon ax = new Ax();
        gameCharacter.setWeapon(ax);
        gameCharacter.attack();
    }
}
