package chainofresponsibility.c2;

public class Main {
    public static void main(String[] args) {
        Attack attack1 = new Attack(100);
        Armor armor1 = new Armor(10);
        Armor armor2 = new Armor(15);

        armor1.setNextDefense(armor2);

        armor1.defense(attack1);

        System.out.println(attack1.getAmount());

        Defense defense = attack -> attack.setAmount(attack.getAmount() - 50);


        // 처음에 armor1 에 넣었음. armor1 -> defense 끝
        // armor2 에 set 해야 armor1 -> armor2 -> defense 성립립
       armor2.setNextDefense(defense);

        Attack attack2 = new Attack(100);
        armor1.defense(attack2);
        System.out.println(attack2.getAmount());
    }
}
