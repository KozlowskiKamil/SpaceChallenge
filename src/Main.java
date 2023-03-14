import java.io.IOException;
import java.net.Socket;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        U1 u1 = new U1(100, 10000, 18000);
        U2 u2 = new U2(120, 18000, 29000);

        Item item = new Item("Coś", 1999);
        u1.carry(item);
        u1.canCarry(item);
        System.out.println(u1.land());
        System.out.println(u1.launch());

        Simulation simulation = new Simulation();
        List<Item> phase1Item = simulation.loadItems("src/phase-1.txt");
        List<Item> phase2Item = simulation.loadItems("src/phase-2.txt");

        simulation.loadU1(phase1Item);
        simulation.loadU2(phase2Item);
        System.out.println(phase1Item);



    }
}