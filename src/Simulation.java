import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    /*    loadItems: ta metoda wczytuje wszystkie przedmioty z pliku tekstowego i zwraca ArrayListę przedmiotów. Każda linia w pliku tekstowym składa się z nazwy przedmiotu,
        po której następuje znak równości i jego waga w kilogramach. Na przykład:
        habitat=100000
        colony=50000
        food=50000
        Metoda loadItems powinna czytać plik tekstowy linia po linii, tworzyć obiekt przedmiotu dla każdej linii, a następnie dodawać go do ArrayListy przedmiotów.
        Metoda powinna zwrócić tę ArrayListę.*/
    public ArrayList loadItems() throws IOException {
        Scanner scanner = new Scanner(new File("src/phase-1.txt"));
        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNext()){
            list.add(scanner.nextLine());
        }scanner.close();
        return list;
    }

    /*    loadU1: ta metoda przyjmuje ArrayListę przedmiotów zwróconą z metody loadItems i zaczyna tworzyć rakiety U1.
        Najpierw próbuje wypełnić jedną rakietę jak największą ilością przedmiotów przed utworzeniem nowego obiektu rakiety i wypełnieniem kolejnego, dopóki wszystkie przedmioty nie zostaną załadowane.
        Metoda zwraca ArrayListę tych rakiet U1, które są w pełni załadowane.*/
    public ArrayList loadU1() {
        return null;
    }

    /*    loadU2: ta metoda również przyjmuje ArrayListę przedmiotów i zaczyna tworzyć rakiety U2, wypełniając je tymi samymi przedmiotami, co w przypadku rakiet U1,
        dopóki wszystkie przedmioty nie zostaną załadowane.
        Metoda zwraca ArrayListę tych rakiet U2, które są w pełni załadowane.*/
    public ArrayList loadU2() {
        return null;
    }

    /*    runSimulation: ta metoda przyjmuje ArrayListę rakiet i wywołuje metody launch i land dla każdej z rakiet w ArrayList.
        Za każdym razem, gdy rakieta eksploduje lub rozbiła się (tj. gdy launch lub land zwróci false), musi wysłać tę rakietę ponownie.
        W międzyczasie śledzi całkowity budżet wymagany do bezpiecznego wysłania każdej rakiety na Marsa.
        Metoda runSimulation zwraca całkowity budżet wymagany do wysłania wszystkich rakiet (w tym tych, które uległy awarii).*/
    public ArrayList runSimulation() {
        return null;
    }
}
