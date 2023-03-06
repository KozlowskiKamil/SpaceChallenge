import java.net.Socket;

public class Main {
    public static void main(String[] args) {

        U1 u1 = new U1(100, 10000, 18000);
        U2 u2 = new U2(120, 18000, 29000);

        Item item = new Item("Coś", 50);

        u1.carry(item);
        u1.carry(item);
        u1.carry(item);
        u1.carry(item);
        u1.carry(item);

        u1.canCarry(item);
        System.out.println(u1.canCarry(item));

    }
}