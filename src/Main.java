import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        Rocket rocke = new Rocket(100, 10000, 18000, 5, 5);
        Item item = new Item("Coś", 7999);
        rocke.carry(item);
        rocke.canCarry(item);
        System.out.println(rocke.canCarry(item));
        System.out.println(item.getWeight());
        System.out.println("");

/*        Rocket rocket = new Rocket();
        Item item = new Item("Coś", 9999999);
        U1 u1 = new U1();
        if (rocket.canCarry(item)){
            System.out.println("tak");
        }else System.out.println("nie");*/
    }
}