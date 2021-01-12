package strategy.weapon;

public class GameCharacter {

    // 접근 점
    private Weapon weapon;

    // 교환 가능
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if (weapon == null) {
            System.out.println("맨손 공격");
            return;
        }
        // 델리게이트
        weapon.attack();
    }
}
